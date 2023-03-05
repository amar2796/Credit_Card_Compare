package com.cdac.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cdac.model.LifeTimeFeeCreditCard;

@Repository
public interface LifeTimeFeeCreditCardRepo extends CrudRepository<LifeTimeFeeCreditCard, Integer>{

}
