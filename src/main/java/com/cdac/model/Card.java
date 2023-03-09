package com.cdac.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Primary;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Card {

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "bankid")
	private Bank bank;   
	
	
	private String card_type;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cardid;

	@OneToMany(mappedBy = "card", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RewardBenefits> products = new ArrayList<>();
	
	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public String getCard_type() {
		return card_type;
	}

	public void setCard_type(String card_type) {
		this.card_type = card_type;
	}

	public int getCardid() {
		return cardid;
	}

	public void setCardid(int cardid) {
		this.cardid = cardid;
	}

	public Card(Bank bank, String card_type, int cardid) {
		super();
		this.bank = bank;
		this.card_type = card_type;
		this.cardid = cardid;
	}

	public Card() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Card [bank=" + bank + ", card_type=" + card_type + ", cardid=" + cardid + "]";
	}
	
	
	
	
	
}
