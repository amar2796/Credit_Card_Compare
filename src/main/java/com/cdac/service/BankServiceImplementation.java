package com.cdac.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cdac.dao.BankRepo;
import com.cdac.model.Bank;

@Service
public class BankServiceImplementation  implements BankService{

	@Autowired
	BankRepo bankRepo;
	
	//Add bank name in database
	@Override
	public void addDataInBankTable(Bank bank) {
		bankRepo.save(bank);
		
	}

	@Override
	public Optional<Bank> getBank(Integer id) {
		// TODO Auto-generated method stub
		return  bankRepo.findById(id);
	}

	@Override
	public List<Bank> getApprovedBanks(boolean isApproved) {
		return bankRepo.getAllCardsByStatus(isApproved);
	}

	@Override
	public List<Bank> getAllBank() {
		return (List<Bank>) bankRepo.findAll();
	}

	@Override
	public List<Bank> getApprovedBanks() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
	
}
