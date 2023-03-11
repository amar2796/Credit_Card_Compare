package com.cdac.service;

import java.util.List;
import java.util.Optional;

import com.cdac.model.Bank;

public interface BankService {

	void addDataInBankTable(Bank bank);
	
	Optional<Bank> getBank(Integer id);
	
	List<Bank> getApprovedBanks();
	
	List<Bank> getAllBank();

	List<Bank> getApprovedBanks(boolean isApproved);
}
