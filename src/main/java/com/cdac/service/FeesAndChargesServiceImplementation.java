package com.cdac.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.FeesAndChargesRepo;
import com.cdac.model.FeesAndCharges;

@Service
public class FeesAndChargesServiceImplementation implements FeesAndChargesService{

	@Autowired
	FeesAndChargesRepo feesAndChargesRepo;

	@Override
	public void addDataRegister(FeesAndCharges feesAndCharges) {
		//System.out.println(feesAndCharges.getCard().getCardid());
		System.out.println(feesAndChargesRepo.existsById(2022));
		if(feesAndChargesRepo.existsById(2022)) {
			FeesAndCharges data=feesAndChargesRepo.findById(202).orElseThrow();
			System.out.println(data.getBalanceTransfer()+" old value");
			System.out.println(feesAndCharges.getBalanceTransfer()+" new value");
			data.setNoAnnualFees(feesAndCharges.getNoAnnualFees());
			data.setMembershipCharges(feesAndCharges.getMembershipCharges());
			data.setCashbacks(feesAndCharges.getCashbacks());
			data.setLowIntrest(feesAndCharges.getLowIntrest());
			data.setTravel(feesAndCharges.getTravel());
			data.setDomesticLounge(feesAndCharges.getDomesticLounge());
			data.setInternationalLounge(feesAndCharges.getInternationalLounge());
			data.setBalanceTransfer(feesAndCharges.getBalanceTransfer());
			data.setInternationalTransaction(feesAndCharges.getInternationalTransaction());
			feesAndChargesRepo.save(data);
		}
		else {
			feesAndChargesRepo.save(feesAndCharges);
		}
	}

	@Override
	public Object findById() {
		// TODO Auto-generated method stub
		return feesAndChargesRepo.findById(152);
	}
}
