package com.cdac.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cdac.model.BalanceTransfers;

@Repository
public interface BalanceTransferRepo extends CrudRepository<BalanceTransfers, Integer>{

}
