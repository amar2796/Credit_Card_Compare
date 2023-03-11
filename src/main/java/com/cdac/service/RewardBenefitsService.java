package com.cdac.service;

import java.util.List;

import com.cdac.model.RewardBenefits;

public interface RewardBenefitsService {

	void registerData(RewardBenefits rewardBenefits);

	List<RewardBenefits> findAllCards();

	
}
