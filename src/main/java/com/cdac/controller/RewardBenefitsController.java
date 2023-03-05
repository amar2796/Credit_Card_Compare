package com.cdac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cdac.model.Card;
import com.cdac.model.RewardBenefits;
import com.cdac.service.RewardBenefitsService;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class RewardBenefitsController {

	@Autowired
	RewardBenefitsService rewardBenefitsService;
	
	//reward&Benefits redirect page 
	@RequestMapping("/reward&Benefits")
	public String rewardBenefits(@RequestParam("cardid") String cardid, Model model,HttpServletResponse response)
	{
		Cookie cookie = new Cookie("cardid", cardid);
		response.addCookie(cookie);
		model.addAttribute("cardid",cardid);
		System.out.println(cardid);
		return "reward&Benefits";
	}
	
	//rewardBenefitsRegister save data (registration page)
	@RequestMapping("/rewardBenefitsRegister")
	public String rewardBenefitsRegister(Model model,@RequestParam("cardid") Card cardid,RewardBenefits rewardBenefits, HttpServletRequest request)
	{
		System.out.println(cardid.getCardid());
		rewardBenefits.setCard(cardid);
		model.addAttribute("cardid", cardid.getCardid());
//		Integer idcard = 0;
//		Cookie[] cookies = request.getCookies();
//	    if (cookies != null) {
//	        for (Cookie cookie : cookies) {
//	            if (cookie.getName().equals("cardid")) {
//	                idcard= Integer.parseInt( cookie.getValue() );
//	            }
//	        }
//	    }
//	    card.setCardid(idcard);
		rewardBenefitsService.registerData(rewardBenefits);
//		System.out.println(idcard);
		return "balanceTransfers";
	}
}
