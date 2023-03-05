package com.cdac.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class FeesAndCharges {

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cardid")
	private Card card;   
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int FeesAndChargesId;
	private String noAnnualFees;
	private String membershipCharges;
	private String cashbacks;
	private String lowIntrest;
	private String travel;
	private String domesticLounge;
	private String internationalLounge;
	private String balanceTransfer;
	private String internationalTransaction;
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	public int getFeesAndChargesId() {
		return FeesAndChargesId;
	}
	public void setFeesAndChargesId(int feesAndChargesId) {
		FeesAndChargesId = feesAndChargesId;
	}
	public String getNoAnnualFees() {
		return noAnnualFees;
	}
	public void setNoAnnualFees(String noAnnualFees) {
		this.noAnnualFees = noAnnualFees;
	}
	public String getMembershipCharges() {
		return membershipCharges;
	}
	public void setMembershipCharges(String membershipCharges) {
		this.membershipCharges = membershipCharges;
	}
	public String getCashbacks() {
		return cashbacks;
	}
	public void setCashbacks(String cashbacks) {
		this.cashbacks = cashbacks;
	}
	public String getLowIntrest() {
		return lowIntrest;
	}
	public void setLowIntrest(String lowIntrest) {
		this.lowIntrest = lowIntrest;
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
	public String getBalanceTransfer() {
		return balanceTransfer;
	}
	public void setBalanceTransfer(String balanceTransfer) {
		this.balanceTransfer = balanceTransfer;
	}
	public String getInternationalTransaction() {
		return internationalTransaction;
	}
	public void setInternationalTransaction(String internationalTransaction) {
		this.internationalTransaction = internationalTransaction;
	}
	public FeesAndCharges(Card card, int feesAndChargesId, String noAnnualFees, String membershipCharges,
			String cashbacks, String lowIntrest, String travel, String domesticLounge, String internationalLounge,
			String balanceTransfer, String internationalTransaction) {
		super();
		this.card = card;
		FeesAndChargesId = feesAndChargesId;
		this.noAnnualFees = noAnnualFees;
		this.membershipCharges = membershipCharges;
		this.cashbacks = cashbacks;
		this.lowIntrest = lowIntrest;
		this.travel = travel;
		this.domesticLounge = domesticLounge;
		this.internationalLounge = internationalLounge;
		this.balanceTransfer = balanceTransfer;
		this.internationalTransaction = internationalTransaction;
	}
	public FeesAndCharges() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "FeesAndCharges [card=" + card + ", FeesAndChargesId=" + FeesAndChargesId + ", noAnnualFees="
				+ noAnnualFees + ", membershipCharges=" + membershipCharges + ", cashbacks=" + cashbacks
				+ ", lowIntrest=" + lowIntrest + ", travel=" + travel + ", domesticLounge=" + domesticLounge
				+ ", internationalLounge=" + internationalLounge + ", balanceTransfer=" + balanceTransfer
				+ ", internationalTransaction=" + internationalTransaction + "]";
	}
	
}
