package com.cdac.model;

import org.hibernate.annotations.GeneratorType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Bank {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int bankid;
	
	String bank_name;
	
	public String getBank_name() {
		return bank_name;
	}
	
	
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	public int getBankid() {
		return bankid;
	}
	public void setBankid(int bankid) {
		this.bankid = bankid;
	}
	public Bank(String bank_name, int bankid) {
		super();
		this.bank_name = bank_name;
		this.bankid = bankid;
	}
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Bank [bank_name=" + bank_name + ", bankid=" + bankid + "]";
	}
	
	
	
}
