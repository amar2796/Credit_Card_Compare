package com.cdac.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class RewardBenefits {
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cardid")
	private Card card;   
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int RewardBenefitsId;
	private String welcomeBenefits;
	private String rewardRates;
	private String movieDining;
	private String domesticLoungeAcces;
	private String rewardPoints;
	private String travel;
	private String domesticLounge;
	private String internationalLounge;
	private String fuel;
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	public int getRewardBenefitsId() {
		return RewardBenefitsId;
	}
	public void setRewardBenefitsId(int rewardBenefitsId) {
		RewardBenefitsId = rewardBenefitsId;
	}
	public String getWelcomeBenefits() {
		return welcomeBenefits;
	}
	public void setWelcomeBenefits(String welcomeBenefits) {
		this.welcomeBenefits = welcomeBenefits;
	}
	public String getRewardRates() {
		return rewardRates;
	}
	public void setRewardRates(String rewardRates) {
		this.rewardRates = rewardRates;
	}
	public String getMovieDining() {
		return movieDining;
	}
	public void setMovieDining(String movieDining) {
		this.movieDining = movieDining;
	}
	public String getDomesticLoungeAcces() {
		return domesticLoungeAcces;
	}
	public void setDomesticLoungeAcces(String domesticLoungeAcces) {
		this.domesticLoungeAcces = domesticLoungeAcces;
	}
	public String getRewardPoints() {
		return rewardPoints;
	}
	public void setRewardPoints(String rewardPoints) {
		this.rewardPoints = rewardPoints;
	}
	public String getTravel() {
		return travel;
	}
	public void setTravel(String travel) {
		this.travel = travel;
	}
	public String getDomesticLounge() {
		return domesticLounge;
	}
	public void setDomesticLounge(String domesticLounge) {
		this.domesticLounge = domesticLounge;
	}
	public String getInternationalLounge() {
		return internationalLounge;
	}
	public void setInternationalLounge(String internationalLounge) {
		this.internationalLounge = internationalLounge;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public RewardBenefits(Card card, int rewardBenefitsId, String welcomeBenefits, String rewardRates,
			String movieDining, String domesticLoungeAcces, String rewardPoints, String travel, String domesticLounge,
			String internationalLounge, String fuel) {
		super();
		this.card = card;
		RewardBenefitsId = rewardBenefitsId;
		this.welcomeBenefits = welcomeBenefits;
		this.rewardRates = rewardRates;
		this.movieDining = movieDining;
		this.domesticLoungeAcces = domesticLoungeAcces;
		this.rewardPoints = rewardPoints;
		this.travel = travel;
		this.domesticLounge = domesticLounge;
		this.internationalLounge = internationalLounge;
		this.fuel = fuel;
	}
	public RewardBenefits() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "RewardBenefits [card=" + card + ", RewardBenefitsId=" + RewardBenefitsId + ", welcomeBenefits="
				+ welcomeBenefits + ", rewardRates=" + rewardRates + ", movieDining=" + movieDining
				+ ", domesticLoungeAcces=" + domesticLoungeAcces + ", rewardPoints=" + rewardPoints + ", travel="
				+ travel + ", domesticLounge=" + domesticLounge + ", internationalLounge=" + internationalLounge
				+ ", fuel=" + fuel + "]";
	}
	
	
}
