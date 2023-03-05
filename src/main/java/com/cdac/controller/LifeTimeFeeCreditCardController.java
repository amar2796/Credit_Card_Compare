package com.cdac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cdac.model.Card;
import com.cdac.model.Cashbacks;
import com.cdac.model.LifeTimeFeeCreditCard;
import com.cdac.service.LifeTimeFeeCreditCardService;

@Controller
public class LifeTimeFeeCreditCardController {

	@Autowired
	LifeTimeFeeCreditCardService lifeTimeFeeCreditCardService; 

	// cashback register data database and throw next page
		@RequestMapping("/lifeTimeFreeCreditCardRegister")
		public String balanceTransfersRegister(@RequestParam("cardid") Card cardid,LifeTimeFeeCreditCard lifeTimeFeeCreditCard,Model model) 
		{
			lifeTimeFeeCreditCard.setCard(cardid);
			model.addAttribute("cardid", cardid.getCardid());
			System.out.println(lifeTimeFeeCreditCard);
			try {
				lifeTimeFeeCreditCardService.addDataRegister(lifeTimeFeeCreditCard);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			return "feesAndCharges";
		}
}
