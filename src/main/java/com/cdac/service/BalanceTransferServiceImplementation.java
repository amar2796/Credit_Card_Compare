package com.cdac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.BalanceTransferRepo;
import com.cdac.model.BalanceTransfers;

@Service
public class BalanceTransferServiceImplementation implements BalanceTransferService{

	@Autowired
	BalanceTransferRepo balanceTransferRepo;
	



	@Override
	public void addDataRegister(BalanceTransfers balanceTransfers) {
		balanceTransferRepo.save(balanceTransfers);
		
	}
}
