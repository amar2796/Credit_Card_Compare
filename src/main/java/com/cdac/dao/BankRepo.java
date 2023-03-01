package com.cdac.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cdac.model.Bank;
@Repository
public interface BankRepo extends CrudRepository<Bank, Integer> {

	

}
