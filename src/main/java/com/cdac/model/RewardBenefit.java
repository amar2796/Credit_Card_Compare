package com.cdac.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
public class RewardBenefit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rewardBenefitsId;
	private String welcomeBenefits;
	private String rewardRate;
	private String movieAndDining;
	private String domesticLoungeAcces;
	private String rewardPoints;
	private String travel;
	private String domesticLounge;
	private String internationalLounge;
	private String fuel;
	private String golf;
	private String insuranceBenefits;
	private String zeroLiabilityProtection;
	public int getRewardBenefitsId() {
		return rewardBenefitsId;
	}
	public void setRewardBenefitsId(int rewardBenefitsId) {
		this.rewardBenefitsId = rewardBenefitsId;
	}
	public String getWelcomeBenefits() {
		return welcomeBenefits;
	}
	public void setWelcomeBenefits(String welcomeBenefits) {
		this.welcomeBenefits = welcomeBenefits;
	}
	public String getRewardRate() {
		return rewardRate;
	}
	public void setRewardRate(String rewardRate) {
		this.rewardRate = rewardRate;
	}
	public String getMovieAndDining() {
		return movieAndDining;
	}
	public void setMovieAndDining(String movieAndDining) {
		this.movieAndDining = movieAndDining;
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
	public String getGolf() {
		return golf;
	}
	public void setGolf(String golf) {
		this.golf = golf;
	}
	public String getInsuranceBenefits() {
		return insuranceBenefits;
	}
	public void setInsuranceBenefits(String insuranceBenefits) {
		this.insuranceBenefits = insuranceBenefits;
	}
	public String getZeroLiabilityProtection() {
		return zeroLiabilityProtection;
	}
	public void setZeroLiabilityProtection(String zeroLiabilityProtection) {
		this.zeroLiabilityProtection = zeroLiabilityProtection;
	}
	@Override
	public String toString() {
		return "RewardBenefit [rewardBenefitsId=" + rewardBenefitsId + ", welcomeBenefits=" + welcomeBenefits
				+ ", rewardRate=" + rewardRate + ", movieAndDining=" + movieAndDining + ", domesticLoungeAcces="
				+ domesticLoungeAcces + ", rewardPoints=" + rewardPoints + ", travel=" + travel + ", domesticLounge="
				+ domesticLounge + ", internationalLounge=" + internationalLounge + ", fuel=" + fuel + ", golf=" + golf
				+ ", insuranceBenefits=" + insuranceBenefits + ", zeroLiabilityProtection=" + zeroLiabilityProtection
				+ "]";
	}
	
}
