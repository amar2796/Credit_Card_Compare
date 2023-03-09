package com.cdac.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cdac.model.Card;
@Repository
public interface CardRepo extends CrudRepository<Card, Integer>{
	
}
