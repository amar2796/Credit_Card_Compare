package com.cdac.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cdac.model.RewardBenefits;
import com.cdac.service.RewardBenefitsService;

@Controller
public class HomeController {
	
	@Autowired
	private RewardBenefitsService benefitsService;

	@RequestMapping("/")
	public String showAllCards(Model model) {
		//List<RewardBenefits> rewardBenefits =  benefitsService.findAllCards();
		
		//System.out.println(rewardBenefits);
		//model.addAttribute("rewardBenefits", rewardBenefits);
		return "home";
	}
	
}
