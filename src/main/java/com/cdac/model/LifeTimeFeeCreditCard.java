package com.cdac.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class LifeTimeFeeCreditCard {

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cardid")
	private Card card;   
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int LifeTimeFeeCreditCardId;
	private String noAnnualFee;
	private String renewalFee;
	private String intrestCharge;
	private String cashAdvanceCharge;
	private String welcomeBonus;
	private String rewardsAndBonus;
	private String specialPerks;
	private String loungeAcces;
	private String internationalTravel;
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	public int getLifeTimeFeeCreditCardId() {
		return LifeTimeFeeCreditCardId;
	}
	public void setLifeTimeFeeCreditCardId(int lifeTimeFeeCreditCardId) {
		LifeTimeFeeCreditCardId = lifeTimeFeeCreditCardId;
	}
	public String getNoAnnualFee() {
		return noAnnualFee;
	}
	public void setNoAnnualFee(String noAnnualFee) {
		this.noAnnualFee = noAnnualFee;
	}
	public String getRenewalFee() {
		return renewalFee;
	}
	public void setRenewalFee(String renewalFee) {
		this.renewalFee = renewalFee;
	}
	public String getIntrestCharge() {
		return intrestCharge;
	}
	public void setIntrestCharge(String intrestCharge) {
		this.intrestCharge = intrestCharge;
	}
	public String getCashAdvanceCharge() {
		return cashAdvanceCharge;
	}
	public void setCashAdvanceCharge(String cashAdvanceCharge) {
		this.cashAdvanceCharge = cashAdvanceCharge;
	}
	public String getWelcomeBonus() {
		return welcomeBonus;
	}
	public void setWelcomeBonus(String welcomeBonus) {
		this.welcomeBonus = welcomeBonus;
	}
	public String getRewardsAndBonus() {
		return rewardsAndBonus;
	}
	public void setRewardsAndBonus(String rewardsAndBonus) {
		this.rewardsAndBonus = rewardsAndBonus;
	}
	public String getSpecialPerks() {
		return specialPerks;
	}
	public void setSpecialPerks(String specialPerks) {
		this.specialPerks = specialPerks;
	}
	public String getLoungeAcces() {
		return loungeAcces;
	}
	public void setLoungeAcces(String loungeAcces) {
		this.loungeAcces = loungeAcces;
	}
	public String getInternationalTravel() {
		return internationalTravel;
	}
	public void setInternationalTravel(String internationalTravel) {
		this.internationalTravel = internationalTravel;
	}
	public LifeTimeFeeCreditCard(Card card, int lifeTimeFeeCreditCardId, String noAnnualFee, String renewalFee,
			String intrestCharge, String cashAdvanceCharge, String welcomeBonus, String rewardsAndBonus,
			String specialPerks, String loungeAcces, String internationalTravel) {
		super();
		this.card = card;
		LifeTimeFeeCreditCardId = lifeTimeFeeCreditCardId;
		this.noAnnualFee = noAnnualFee;
		this.renewalFee = renewalFee;
		this.intrestCharge = intrestCharge;
		this.cashAdvanceCharge = cashAdvanceCharge;
		this.welcomeBonus = welcomeBonus;
		this.rewardsAndBonus = rewardsAndBonus;
		this.specialPerks = specialPerks;
		this.loungeAcces = loungeAcces;
		this.internationalTravel = internationalTravel;
	}
	public LifeTimeFeeCreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "LifeTimeFeeCreditCard [card=" + card + ", LifeTimeFeeCreditCardId=" + LifeTimeFeeCreditCardId
				+ ", noAnnualFee=" + noAnnualFee + ", renewalFee=" + renewalFee + ", intrestCharge=" + intrestCharge
				+ ", cashAdvanceCharge=" + cashAdvanceCharge + ", welcomeBonus=" + welcomeBonus + ", rewardsAndBonus="
				+ rewardsAndBonus + ", specialPerks=" + specialPerks + ", loungeAcces=" + loungeAcces
				+ ", internationalTravel=" + internationalTravel + "]";
	}
	
	
}
