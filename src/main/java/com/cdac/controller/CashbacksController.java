package com.cdac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cdac.model.BalanceTransfers;
import com.cdac.model.Card;
import com.cdac.model.Cashbacks;
import com.cdac.service.CashbacksService;

@Controller
public class CashbacksController {

	@Autowired
	CashbacksService cashbacksService;
	
	// cashback register data database and throw next page
	@RequestMapping("/cashbacksRegister")
	public String balanceTransfersRegister(@RequestParam("cardid") Card cardid,Cashbacks cashbacks,Model model) 
	{
		cashbacks.setCard(cardid);
		model.addAttribute("cardid", cardid.getCardid());
		System.out.println(cashbacks);
		try {
			cashbacksService.addDataRegister(cashbacks);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return "lifeTimeFeeCreditCard";
	}
}
