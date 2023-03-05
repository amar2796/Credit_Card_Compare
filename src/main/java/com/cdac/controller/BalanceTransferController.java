package com.cdac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cdac.model.BalanceTransfers;
import com.cdac.model.Card;
import com.cdac.service.BalanceTransferService;

@Controller
public class BalanceTransferController {

	@Autowired
	BalanceTransferService balanceTransferService;
	
	@RequestMapping("/balanceTransfersRegister")
	public String balanceTransfersRegister(@RequestParam("cardid") Card cardid,BalanceTransfers balanceTransfers,Model model) 
	{
		System.out.println(balanceTransfers);
		balanceTransfers.setCard(cardid);
		model.addAttribute("cardid", cardid.getCardid());
		System.out.println(balanceTransfers);
		try {
			balanceTransferService.addDataRegister(balanceTransfers);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return "cashbacks";
	}
}
