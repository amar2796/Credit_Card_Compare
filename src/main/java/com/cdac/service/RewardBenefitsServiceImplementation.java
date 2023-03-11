package com.cdac.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.cdac.dao.RewardBenefitsRepo;
import com.cdac.model.RewardBenefit;

@Service
public class RewardBenefitsServiceImplementation implements RewardBenefitsService{

	@Autowired
	RewardBenefitsRepo rewardBenefitsRepo;

	@Override
	public void registerData(RewardBenefit rewardBenefits) {
		rewardBenefitsRepo.save(rewardBenefits);
		
	}

	@Override
	public List<RewardBenefit> findAllRewardBenefits() {
		return (List<RewardBenefit>)rewardBenefitsRepo.findAll();
		
	}

	@Override
	public Optional<RewardBenefit> findById(Integer id) {
		return rewardBenefitsRepo.findById(id);
	}

	
}
