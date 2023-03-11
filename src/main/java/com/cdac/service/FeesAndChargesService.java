package com.cdac.service;

import java.util.List;
import java.util.Optional;

import com.cdac.model.FeesAndCharge;

public interface FeesAndChargesService {

	void addDataRegister(FeesAndCharge feesAndCharges);

	List<FeesAndCharge> getAllFeeAndCharge();

	Optional<FeesAndCharge> getFeesAndCharge(Integer id);

}
