package com.cdac.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cdac.dao.BankRepo;
import com.cdac.dao.CardRepo;
import com.cdac.dto.CardDTO;
import com.cdac.model.Bank;
import com.cdac.model.Card;
import com.cdac.model.Category;
import com.cdac.service.BankService;
import com.cdac.service.CardService;
import com.cdac.service.CategoryService;

@Controller
public class CardController {

	@Autowired
	CardService cardService;
	
	@Autowired
	BankService bankService;
	
	@Autowired
	CategoryService categoryService;
	
	@Autowired
	BankRepo bankRepo;
	@Autowired
	CardRepo cardRepo;
	
	@RequestMapping("/addCardDashboard/{id}")
	public String addCardDashboard(@PathVariable("id") int id, Model model)
	{
		Bank bank = bankRepo.findById(id)
	            .orElseThrow(() -> new IllegalArgumentException("Invalid bank id: " + id));
	    model.addAttribute("bank", bank);
	    model.addAttribute("categories", categoryService.getAllCategories());
		return "addCardDashboard";
	}
	// add card dashboard register mapping addCard
	@RequestMapping("/addCardRegister")
	public String addCardRegister(@RequestParam Integer categoryId, @RequestParam Integer bankid,@RequestParam String bankName, @RequestParam String cardName, Model model)   //Card replace CardDTO
 	{
		System.out.println(categoryId);
		Optional<Category> category = categoryService.getCategory(categoryId);
		Optional<Bank> bank = bankService.getBank(bankid);
		Card card = new Card();
		card.setBank(bank.get());
		card.setCardName(cardName);
		card.setCategory(category.get());
		model.addAttribute("bankid", bank.get().getBankid());
		cardService.saveCard(card);
		model.addAttribute("cardid", card.getCardid());
		return "redirect:teamDashboard1";
	}
	
		// Card Edit detail
		@GetMapping("/card/edit/{id}")
	    public String showEditForm(@PathVariable("id") int id, Model model) {
	        Card card = cardRepo.findById(id)
	            .orElseThrow(() -> new IllegalArgumentException("Invalid card id: " + id));
	        model.addAttribute("card", card);
	        return "addCardDashboardEditForm";
	    }

		@PostMapping("/card/update/{id}")
		public String updatePerson(@ModelAttribute("cardName") String cardName,@PathVariable("id") int id){
			Card card=cardRepo.findById(id).orElseThrow();
			card.setCardName(cardName);
			cardService.saveCard(card);
			 
		  return "redirect:/teamDashboard1";
		}
		
//		
//		// Bank detail delete
//		@GetMapping("/bankDetail/delete/{id}")
//	    public String showDeleteForm(@PathVariable("id") int id) {
//	        Bank person1 = bankRepo.findById(id)
//	            .orElseThrow(() -> new IllegalArgumentException("Invalid person id: " + id));
//	        bankRepo.deleteById(id);
//	        return "redirect:/teamDashboard1";
//		}
//	
	
}
