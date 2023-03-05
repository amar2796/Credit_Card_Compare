package com.cdac.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Cashbacks {


	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cardid")
	private Card card;   
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int CashbacksId;
	private String welcomeBenefits;
	private String milestoneBenefits;
	private String travelBenefits;
	private String moviesAndDiningBenefits;
	private String rewardsAndFeatures;
	private String onlineSpends;
	private String offlineSpends;
	private String fuels;
	private String eCommerceCashbacks;
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	public int getCashbacksId() {
		return CashbacksId;
	}
	public void setCashbacksId(int cashbacksId) {
		CashbacksId = cashbacksId;
	}
	public String getWelcomeBenefits() {
		return welcomeBenefits;
	}
	public void setWelcomeBenefits(String welcomeBenefits) {
		this.welcomeBenefits = welcomeBenefits;
	}
	public String getMilestoneBenefits() {
		return milestoneBenefits;
	}
	public void setMilestoneBenefits(String milestoneBenefits) {
		this.milestoneBenefits = milestoneBenefits;
	}
	public String getTravelBenefits() {
		return travelBenefits;
	}
	public void setTravelBenefits(String travelBenefits) {
		this.travelBenefits = travelBenefits;
	}
	public String getMoviesAndDiningBenefits() {
		return moviesAndDiningBenefits;
	}
	public void setMoviesAndDiningBenefits(String moviesAndDiningBenefits) {
		this.moviesAndDiningBenefits = moviesAndDiningBenefits;
	}
	public String getRewardsAndFeatures() {
		return rewardsAndFeatures;
	}
	public void setRewardsAndFeatures(String rewardsAndFeatures) {
		this.rewardsAndFeatures = rewardsAndFeatures;
	}
	public String getOnlineSpends() {
		return onlineSpends;
	}
	public void setOnlineSpends(String onlineSpends) {
		this.onlineSpends = onlineSpends;
	}
	public String getOfflineSpends() {
		return offlineSpends;
	}
	public void setOfflineSpends(String offlineSpends) {
		this.offlineSpends = offlineSpends;
	}
	public String getFuels() {
		return fuels;
	}
	public void setFuels(String fuels) {
		this.fuels = fuels;
	}
	public String geteCommerceCashbacks() {
		return eCommerceCashbacks;
	}
	public void seteCommerceCashbacks(String eCommerceCashbacks) {
		this.eCommerceCashbacks = eCommerceCashbacks;
	}
	public Cashbacks(Card card, int cashbacksId, String welcomeBenefits, String milestoneBenefits,
			String travelBenefits, String moviesAndDiningBenefits, String rewardsAndFeatures, String onlineSpends,
			String offlineSpends, String fuels, String eCommerceCashbacks) {
		super();
		this.card = card;
		CashbacksId = cashbacksId;
		this.welcomeBenefits = welcomeBenefits;
		this.milestoneBenefits = milestoneBenefits;
		this.travelBenefits = travelBenefits;
		this.moviesAndDiningBenefits = moviesAndDiningBenefits;
		this.rewardsAndFeatures = rewardsAndFeatures;
		this.onlineSpends = onlineSpends;
		this.offlineSpends = offlineSpends;
		this.fuels = fuels;
		this.eCommerceCashbacks = eCommerceCashbacks;
	}
	public Cashbacks() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Cashbacks [card=" + card + ", CashbacksId=" + CashbacksId + ", welcomeBenefits=" + welcomeBenefits
				+ ", milestoneBenefits=" + milestoneBenefits + ", travelBenefits=" + travelBenefits
				+ ", moviesAndDiningBenefits=" + moviesAndDiningBenefits + ", rewardsAndFeatures=" + rewardsAndFeatures
				+ ", onlineSpends=" + onlineSpends + ", offlineSpends=" + offlineSpends + ", fuels=" + fuels
				+ ", eCommerceCashbacks=" + eCommerceCashbacks + "]";
	}
	
}
