package com.cdac.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cdac.model.Cashbacks;

@Repository
public interface cashbacksRepo extends CrudRepository<Cashbacks, Integer>{

	
}
