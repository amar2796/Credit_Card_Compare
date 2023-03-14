package com.cdac.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.BankRepo;
import com.cdac.dao.CardRepo;
import com.cdac.model.Bank;
import com.cdac.model.Card;

@Service
public class CardServiceImplementation implements CardService{

	
	@Autowired
	CardRepo cardRepo;
	
	@Autowired
	BankRepo bankRepo;

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
		return cards;
	}
	
	@Override
	public List<Card> getCardByBankBankid(Integer id) {
		List<Card> cards = cardRepo.findByBankBankid(id);
		return cards;
	}

	@Override
	public List<Card> getCardsByStatus(boolean isApproved) {
		// TODO Auto-generated method stub
		return cardRepo.getApprovedCards(isApproved);
	}
	
	@Override
	public Card getFirstCard(int i) {
		
		return cardRepo.getCardId(i);
	}


	@Override
	public Card getCardById(Integer id) {
		Card cards = cardRepo.findById(id).get();
		return cards;
	}

	
	

	


	
	
	
}
