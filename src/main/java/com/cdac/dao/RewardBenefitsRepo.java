package com.cdac.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cdac.model.RewardBenefits;

@Repository
public interface RewardBenefitsRepo extends CrudRepository<RewardBenefits, Integer>{

}
