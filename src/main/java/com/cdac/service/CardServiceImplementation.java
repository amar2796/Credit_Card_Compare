package com.cdac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.CardRepo;
import com.cdac.model.Card;

@Service
public class CardServiceImplementation implements CardService{

	
	@Autowired
	CardRepo cardRepo;

	@Override
	public void saveCardRegister(Card card) {
		System.out.println(card);
		cardRepo.save(card);
		
	}
}
