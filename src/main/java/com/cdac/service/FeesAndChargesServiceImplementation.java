package com.cdac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.FeesAndChargesRepo;
import com.cdac.model.FeesAndCharges;

@Service
public class FeesAndChargesServiceImplementation implements FeesAndChargesService{

	@Autowired
	FeesAndChargesRepo feesAndChargesRepo;

	@Override
	public void addDataRegister(FeesAndCharges feesAndCharges) {
		feesAndChargesRepo.save(feesAndCharges);
		
	}
}
