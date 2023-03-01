package com.cdac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cdac.dao.BankRepo;
import com.cdac.model.Bank;

@Service
public class BankServiceImplementation  implements BankService{

	@Autowired
	BankRepo bankRepo;

	@Override
	public void addDataInBankTable(Bank bank) {
		bankRepo.save(bank);
		
	}
	
	
}