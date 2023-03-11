package com.cdac.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cdac.model.Card;
import com.cdac.model.FeesAndCharge;

@Repository
public interface FeesAndChargesRepo extends CrudRepository<FeesAndCharge, Integer>{

	void save(Optional<FeesAndCharge> data);


}
