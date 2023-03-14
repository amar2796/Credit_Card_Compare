package com.cdac.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cdac.model.Card;
@Repository
public interface CardRepo extends JpaRepository<Card, Integer>{

	List<Card> findByCategoryId(Integer id);
	
	
	@Query("SELECT c FROM Card c WHERE c.isApproved = ?1")
	List<Card> getApprovedCards(boolean isApproved);



	List<Card> findByBankBankid(Integer id);

	@Query("SELECT c FROM Card c WHERE c.cardid = ?1")
	Card getCardId(int i);


	
}
