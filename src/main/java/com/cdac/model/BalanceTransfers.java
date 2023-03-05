package com.cdac.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class BalanceTransfers {


	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cardid")
	private Card card;   
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int BalanceTransfersId;
	private String intrestFreePeriod;
	private String postBalanceTransfer;
	private String zeroPercentBalanceTransfer;
	private String emiPayment;
	private String perpetualBalanceTransfer;
	private String travel;
	private String domesticLounge;
	private String internationalLounge;
	private String fuels;
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	public int getBalanceTransfersId() {
		return BalanceTransfersId;
	}
	public void setBalanceTransfersId(int balanceTransfersId) {
		BalanceTransfersId = balanceTransfersId;
	}
	public String getIntrestFreePeriod() {
		return intrestFreePeriod;
	}
	public void setIntrestFreePeriod(String intrestFreePeriod) {
		this.intrestFreePeriod = intrestFreePeriod;
	}
	public String getPostBalanceTransfer() {
		return postBalanceTransfer;
	}
	public void setPostBalanceTransfer(String postBalanceTransfer) {
		this.postBalanceTransfer = postBalanceTransfer;
	}
	public String getZeroPercentBalanceTransfer() {
		return zeroPercentBalanceTransfer;
	}
	public void setZeroPercentBalanceTransfer(String zeroPercentBalanceTransfer) {
		this.zeroPercentBalanceTransfer = zeroPercentBalanceTransfer;
	}
	public String getEmiPayment() {
		return emiPayment;
	}
	public void setEmiPayment(String emiPayment) {
		this.emiPayment = emiPayment;
	}
	public String getPerpetualBalanceTransfer() {
		return perpetualBalanceTransfer;
	}
	public void setPerpetualBalanceTransfer(String perpetualBalanceTransfer) {
		this.perpetualBalanceTransfer = perpetualBalanceTransfer;
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
	public String getFuels() {
		return fuels;
	}
	public void setFuels(String fuels) {
		this.fuels = fuels;
	}
	public BalanceTransfers(Card card, int balanceTransfersId, String intrestFreePeriod, String postBalanceTransfer,
			String zeroPercentBalanceTransfer, String emiPayment, String perpetualBalanceTransfer, String travel,
			String domesticLounge, String internationalLounge, String fuels) {
		super();
		this.card = card;
		BalanceTransfersId = balanceTransfersId;
		this.intrestFreePeriod = intrestFreePeriod;
		this.postBalanceTransfer = postBalanceTransfer;
		this.zeroPercentBalanceTransfer = zeroPercentBalanceTransfer;
		this.emiPayment = emiPayment;
		this.perpetualBalanceTransfer = perpetualBalanceTransfer;
		this.travel = travel;
		this.domesticLounge = domesticLounge;
		this.internationalLounge = internationalLounge;
		this.fuels = fuels;
	}
	public BalanceTransfers() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "BalanceTransfers [card=" + card + ", BalanceTransfersId=" + BalanceTransfersId + ", intrestFreePeriod="
				+ intrestFreePeriod + ", postBalanceTransfer=" + postBalanceTransfer + ", zeroPercentBalanceTransfer="
				+ zeroPercentBalanceTransfer + ", emiPayment=" + emiPayment + ", perpetualBalanceTransfer="
				+ perpetualBalanceTransfer + ", travel=" + travel + ", domesticLounge=" + domesticLounge
				+ ", internationalLounge=" + internationalLounge + ", fuels=" + fuels + "]";
	}
	
	
}
