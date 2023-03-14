package com.cdac.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cdac.model.Card;
import com.cdac.model.Contact;
import com.cdac.model.RewardBenefit;
import com.cdac.service.CardService;
import com.cdac.service.ContactService;
import com.cdac.service.RewardBenefitsService;

@Controller
public class HomeController {
	
	@Autowired
	private RewardBenefitsService benefitsService;
	
	@Autowired
	private CardService cardService;
	
	@Autowired
	private ContactService contactService;

	@RequestMapping("/")
	public String showAllCards(Model model) {
		model.addAttribute("firstCard", cardService.getFirstCard(1));
		model.addAttribute("secondCard", cardService.getFirstCard(2));
		model.addAttribute("thirdCard", cardService.getFirstCard(7));
		model.addAttribute("forthCard", cardService.getFirstCard(9));
		model.addAttribute("fiveCard", cardService.getFirstCard(8));
		model.addAttribute("sixCard", cardService.getFirstCard(52));
		return "home";
	}
	
	//categoriesPage mapping
	@RequestMapping("/categoriesPage")
	public String categoriesPage() {
		return "categoriesPage";
	}
	
	// categories page card wise
	@RequestMapping("/categoriesPage/{id}")
	public String categoriesPage(@PathVariable int id, Model model){
		List<Card> cards = cardService.getCardByCategoryId(id);
		model.addAttribute("cards", cards);
		return "categoriesPage";
	}
	
	// CardDetail page mapping
	@RequestMapping("/cardDetail/{id}")
	public String cardDetail(@PathVariable int id,Model model) {
		Card cards = cardService.getCardById(id);
		model.addAttribute("cards", cards);
		return "cardDetail";
	}
	// bank wise categories
	@RequestMapping("/categoriesPageBank/{id}")
	public String categoriesPageBank(@PathVariable int id, Model model){
		
		List<Card> cards = cardService.getCardByBankBankid(id);
		model.addAttribute("cards", cards);
		return "categoriesPage";
	}
	
	//contact page mapping
	@RequestMapping("/submitContact")
	public String submitContact(Contact contact) {
		contactService.registerContact(contact);
		return "redirect:/";
	}
	
	//back mapping
	@RequestMapping("/back")
	public String back() {
		return "redirect:/";
	}
	
}
