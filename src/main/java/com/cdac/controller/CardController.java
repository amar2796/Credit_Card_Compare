package com.cdac.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
	
	// add card dashboard register mapping addCard
	@RequestMapping("/addCardRegister")
	public String addCardRegister(CardDTO card)
	{
		
		System.out.println(card);
		Card card1=new Card();
		
		card1.setCard_type(card.getCard_type());
		Optional<Bank> bank= bankRepo.findById(card.getBankid());
		card1.setBank(bank.get());
		cardService.saveCardRegister(card1);
		return "addCard";
	}
}
