package com.cdac.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cdac.model.Bank;
@Repository
public interface BankRepo extends CrudRepository<Bank, Integer> {

	@Query("SELECT b FROM Bank b WHERE b.isApproved = ?1")
	List<Bank> getAllCardsByStatus(boolean isApproved);
	
	@Query("SELECT b FROM Bank b WHERE b.bankName = ?1")
	List<Bank> findByBankName(String name); 

}
