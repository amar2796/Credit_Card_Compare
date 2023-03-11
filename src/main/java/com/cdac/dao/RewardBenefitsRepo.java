package com.cdac.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cdac.model.RewardBenefit;

@Repository

public interface RewardBenefitsRepo extends CrudRepository<RewardBenefit, Integer>{

	
	
//	@Query("select * from reward_benefits")
//	List<RewardBenefits> findByreward_benefits_id();

	
	
}
