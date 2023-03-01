package com.cdac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cdac.model.Bank;
import com.cdac.service.BankService;

@Controller
public class BankController {

	@Autowired
	BankService bankService;
	
	//addBank page mapping
	@RequestMapping("/addBank")
	public String addBank()
	{
		return "addBank";
	}
	
	//bank register page mapping to addCardDashboard
	@RequestMapping("/addBankRegister")
	public String addCard(Bank bank)
	{
		System.out.println(bank);
		bankService.addDataInBankTable(bank);
		return "addCardDashboard";
	}
}
