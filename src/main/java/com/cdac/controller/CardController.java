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
import com.cdac.service.CardService;

@Controller
public class CardController {

	@Autowired
	CardService cardService;
	
	@Autowired
	BankRepo bankRepo;
	@Autowired
	CardRepo cardRepo;
	
	@RequestMapping("/addCardDashboard/{id}")
	public String addCardDashboard(@PathVariable("id") int id, Model model)
	{
		Bank person = bankRepo.findById(id)
	            .orElseThrow(() -> new IllegalArgumentException("Invalid person id: " + id));
	        model.addAttribute("person", person);
		return "addCardDashboard";
	}
	// add card dashboard register mapping addCard
	@RequestMapping("/addCardRegister")
	public String addCardRegister(Card card,@RequestParam Bank bankid,Model model)   //Card replace CardDTO
 	{
		card.setBank(bankid);
		model.addAttribute("bankid", bankid.getBankid());
		cardService.saveCardRegister(card);
		model.addAttribute("cardid", card.getCardid());
		return "redirect:teamDashboard1";
	}
	
		// Card Edit detail
		@GetMapping("/card/edit/{id}")
	    public String showEditForm(@PathVariable("id") int id, Model model) {
			System.out.println(id);
	        Card person2 = cardRepo.findById(id)
	            .orElseThrow(() -> new IllegalArgumentException("Invalid person id: " + id));
	        model.addAttribute("person", person2);
	        return "addCardDashboardEditForm";
	    }

		@PostMapping("/card/update/{id}")
		public String updatePerson(@ModelAttribute("person") Card person,@PathVariable("id") int id){
			Card person1=cardRepo.findById(id).orElseThrow();
			person1.setCard_type(person.getCard_type());
			cardRepo.save(person1);
			 
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
