package com.cdac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.cashbacksRepo;
import com.cdac.model.Cashbacks;

@Service
public class CashbacksServiceImplementation implements CashbacksService {

	@Autowired
	cashbacksRepo cashbacksRepo;

	@Override
	public void addDataRegister(Cashbacks cashbacks) {
		cashbacksRepo.save(cashbacks);

	}
}
