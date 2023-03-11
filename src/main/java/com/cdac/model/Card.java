package com.cdac.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.lang.NonNull;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.Setter;

@Entity
public class Card {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cardid;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "bankId")
	private Bank bank;   
	private String cardName;
	
//	@OneToMany(mappedBy = "card", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<RewardBenefits> products = new ArrayList<>();
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "categoryId")
	private Category category;
	
	private String documentRequired;
	private String highlights;
	
	@OneToOne
	@JoinColumn(name = "rewardBenefitsId")
	private RewardBenefit rewardBenefit;
	@OneToOne
	@JoinColumn(name = "feesAndChargesId")
	private FeesAndCharge feesAndCharge;
	private boolean isApproved;
	public int getCardid() {
		return cardid;
	}
	public void setCardid(int cardid) {
		this.cardid = cardid;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getDocumentRequired() {
		return documentRequired;
	}
	public void setDocumentRequired(String documentRequired) {
		this.documentRequired = documentRequired;
	}
	public String getHighlights() {
		return highlights;
	}
	public void setHighlights(String highlights) {
		this.highlights = highlights;
	}
	public RewardBenefit getRewardBenefit() {
		return rewardBenefit;
	}
	public void setRewardBenefit(RewardBenefit rewardBenefit) {
		this.rewardBenefit = rewardBenefit;
	}
	public FeesAndCharge getFeesAndCharge() {
		return feesAndCharge;
	}
	public void setFeesAndCharge(FeesAndCharge feesAndCharge) {
		this.feesAndCharge = feesAndCharge;
	}
	public boolean getIsApproved() {
		return isApproved;
	}
	public void setIsApproved(boolean isApproved) {
		this.isApproved = isApproved;
	}
	@Override
	public String toString() {
		return "Card [cardid=" + cardid + ", bank=" + bank + ", cardName=" + cardName + ", category=" + category
				+ ", documentRequired=" + documentRequired + ", highlights=" + highlights + ", rewardBenefit="
				+ rewardBenefit + ", feesAndCharge=" + feesAndCharge + ", isApproved=" + isApproved + "]";
	}
	
}
