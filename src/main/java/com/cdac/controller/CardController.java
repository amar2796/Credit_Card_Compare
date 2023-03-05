package com.cdac.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	@RequestMapping("/addCardDashboard")
	public String addCardDashboard()
	{
		return "addCardDashboard";
	}
	// add card dashboard register mapping addCard
	@RequestMapping("/addCardRegister")
	public String addCardRegister(Card card,@RequestParam Bank bankid,Model model)   //Card replace CardDTO
 	{
		
//		System.out.println(card);
//		Card card1=new Card();
//		
//		card1.setCard_type(card.getCard_type());
//		Optional<Bank> bank= bankRepo.findById(card.getBankid());
//		card1.setBank(bank.get());
//		cardService.saveCardRegister(card1);
//	
//		cardService.saveCardRegister(card);
		card.setBank(bankid);
		System.out.println(bankid.getBankid());
		model.addAttribute("bankid", bankid.getBankid());
		cardService.saveCardRegister(card);
		System.out.println(card.getCardid());
		model.addAttribute("cardid", card.getCardid());
		return "addCard";
	}
	
	
}
