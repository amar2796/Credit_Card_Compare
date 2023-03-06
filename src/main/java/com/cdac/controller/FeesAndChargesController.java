package com.cdac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cdac.dao.BankRepo;
import com.cdac.model.Card;
import com.cdac.model.FeesAndCharges;
import com.cdac.model.LifeTimeFeeCreditCard;
import com.cdac.service.FeesAndChargesService;

@Controller
public class FeesAndChargesController {

	@Autowired
	FeesAndChargesService feesAndChargesService;
	
	
	@Autowired
	BankRepo bankRepo;
	
	//feesAndCharges mapping same class
	@RequestMapping("/feesAndCharges")
	public String feesAndCharges()
	{
		return "feesAndCharges";
	}
	
	
	// feesAndCharges register data database and throw next page
			@RequestMapping("/feesAndChargesRegister")
			public String balanceTransfersRegister(@RequestParam("cardid") Card cardid,FeesAndCharges feesAndCharges,Model model) 
			{
				feesAndCharges.setCard(cardid);
				model.addAttribute("cardid", cardid.getCardid());
				try {
					feesAndChargesService.addDataRegister(feesAndCharges);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				return "redirect:/teamDashboardBank";
			}
			
			@RequestMapping("/teamDashboardBank")
		    public String newPage(Model model) {
				model.addAttribute("bank",bankRepo.findAll());
		        return "teamDashboard";
		    }
			
			//feesAndCharges mapping for editing
			@RequestMapping("/feesAndChargesEditing")
			public String feesAndChargesEditing(Model model)
			{
				model.addAttribute("editing", feesAndChargesService.findById());
				
				return "/Updation/feesAndChargesUpdate";
			}
			
			
		
}
