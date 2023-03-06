package com.cdac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.cdac.dao.RewardBenefitsRepo;
import com.cdac.model.RewardBenefits;

@Service
public class RewardBenefitsServiceImplementation implements RewardBenefitsService{

	@Autowired
	RewardBenefitsRepo rewardBenefitsRepo;

	@Override
	public void registerData(RewardBenefits rewardBenefits) {
		rewardBenefitsRepo.save(rewardBenefits);
		
	}

	
}
