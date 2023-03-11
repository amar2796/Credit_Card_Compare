package com.cdac.model;

import org.hibernate.annotations.GeneratorType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
public class Bank {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int bankid;
	String bankName;
	String description;
	boolean isApproved;
	public int getBankid() {
		return bankid;
	}
	public void setBankid(int bankid) {
		this.bankid = bankid;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean getIsApproved() {
		return isApproved;
	}
	public void setIsApproved(boolean isApproved) {
		this.isApproved = isApproved;
	}
	@Override
	public String toString() {
		return "Bank [bankid=" + bankid + ", bankName=" + bankName + ", description=" + description + ", isApproved="
				+ isApproved + "]";
	}
	
}
