package com.cdac.service;

import java.util.List;
import java.util.Optional;

import com.cdac.model.RewardBenefit;

public interface RewardBenefitsService {

	void registerData(RewardBenefit rewardBenefits);

	List<RewardBenefit> findAllRewardBenefits();
	Optional<RewardBenefit> findById(Integer id);

	
}
