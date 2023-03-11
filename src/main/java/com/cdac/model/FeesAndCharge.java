package com.cdac.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
public class FeesAndCharge {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int feesAndChargesId;
	private String joiningFee;
	private String renewalFee;
	private String spendBasedWaiver;
	private String rewardsRedemptionFee;
	private String interestRates;
	private String foreignCurrencyMarkup;
	private String fuelSurcharge;
	private String cashAdvanceCharge;
	private String addOnCardFee;
	public int getFeesAndChargesId() {
		return feesAndChargesId;
	}
	public void setFeesAndChargesId(int feesAndChargesId) {
		this.feesAndChargesId = feesAndChargesId;
	}
	public String getJoiningFee() {
		return joiningFee;
	}
	public void setJoiningFee(String joiningFee) {
		this.joiningFee = joiningFee;
	}
	public String getRenewalFee() {
		return renewalFee;
	}
	public void setRenewalFee(String renewalFee) {
		this.renewalFee = renewalFee;
	}
	public String getSpendBasedWaiver() {
		return spendBasedWaiver;
	}
	public void setSpendBasedWaiver(String spendBasedWaiver) {
		this.spendBasedWaiver = spendBasedWaiver;
	}
	public String getRewardsRedemptionFee() {
		return rewardsRedemptionFee;
	}
	public void setRewardsRedemptionFee(String rewardsRedemptionFee) {
		this.rewardsRedemptionFee = rewardsRedemptionFee;
	}
	public String getInterestRates() {
		return interestRates;
	}
	public void setInterestRates(String interestRates) {
		this.interestRates = interestRates;
	}
	public String getForeignCurrencyMarkup() {
		return foreignCurrencyMarkup;
	}
	public void setForeignCurrencyMarkup(String foreignCurrencyMarkup) {
		this.foreignCurrencyMarkup = foreignCurrencyMarkup;
	}
	public String getFuelSurcharge() {
		return fuelSurcharge;
	}
	public void setFuelSurcharge(String fuelSurcharge) {
		this.fuelSurcharge = fuelSurcharge;
	}
	public String getCashAdvanceCharge() {
		return cashAdvanceCharge;
	}
	public void setCashAdvanceCharge(String cashAdvanceCharge) {
		this.cashAdvanceCharge = cashAdvanceCharge;
	}
	public String getAddOnCardFee() {
		return addOnCardFee;
	}
	public void setAddOnCardFee(String addOnCardFee) {
		this.addOnCardFee = addOnCardFee;
	}
	@Override
	public String toString() {
		return "FeesAndCharge [feesAndChargesId=" + feesAndChargesId + ", joiningFee=" + joiningFee + ", renewalFee="
				+ renewalFee + ", spendBasedWaiver=" + spendBasedWaiver + ", rewardsRedemptionFee="
				+ rewardsRedemptionFee + ", interestRates=" + interestRates + ", foreignCurrencyMarkup="
				+ foreignCurrencyMarkup + ", fuelSurcharge=" + fuelSurcharge + ", cashAdvanceCharge="
				+ cashAdvanceCharge + ", addOnCardFee=" + addOnCardFee + "]";
	}
	
}
