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
		//List<RewardBenefits> rewardBenefits =  benefitsService.findAllCards();
		
		//System.out.println(rewardBenefits);
		//model.addAttribute("rewardBenefits", rewardBenefits);
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
	
	// bank wise categories
	@RequestMapping("/categoriesPageBank/{id}")
	public void categoriesPageBank(@PathVariable int id, Model model){
		
		//return "categoriesPage";
	}
	
	//contact page mapping
	@RequestMapping("/submitContact")
	public String submitContact(Contact contact) {
		contactService.registerContact(contact);
		return "home";
	}
}
