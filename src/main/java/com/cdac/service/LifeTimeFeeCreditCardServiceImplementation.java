package com.cdac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.LifeTimeFeeCreditCardRepo;
import com.cdac.model.LifeTimeFeeCreditCard;

@Service
public class LifeTimeFeeCreditCardServiceImplementation implements LifeTimeFeeCreditCardService{

	@Autowired
	LifeTimeFeeCreditCardRepo lifeTimeFeeCreditCardRepo;

	@Override
	public void addDataRegister(LifeTimeFeeCreditCard lifeTimeFeeCreditCard) {
		lifeTimeFeeCreditCardRepo.save(lifeTimeFeeCreditCard);
		
	}
}
