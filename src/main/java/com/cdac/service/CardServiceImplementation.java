package com.cdac.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.CardRepo;
import com.cdac.model.Card;

@Service
public class CardServiceImplementation implements CardService{

	
	@Autowired
	CardRepo cardRepo;

	@Override
	public void saveCard(Card card) {
		cardRepo.save(card);
	}
	
	public Optional<Card> getCard(Integer id) {
		return cardRepo.findById(id);
	}

	@Override
	public List<Card> getAllCards() {
		
		return (List<Card>) cardRepo.findAll();
	}

	@Override
	public List<Card> getCardByCategoryId(Integer id) {
		List<Card> cards = cardRepo.findByCategoryId(id);
		System.out.println("Card List by category");
		System.out.println(cards);
		return cards;
	}

	@Override
	public List<Card> getCardsByStatus(boolean isApproved) {
		// TODO Auto-generated method stub
		return cardRepo.getApprovedCards(isApproved);
	}
	
	
}
