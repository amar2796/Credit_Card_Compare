package com.cdac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cdac.dao.CardRepo;
import com.cdac.dao.LifeTimeFeeCreditCardRepo;
import com.cdac.model.Card;
import com.cdac.model.Cashbacks;
import com.cdac.model.LifeTimeFeeCreditCard;
import com.cdac.model.RewardBenefits;
import com.cdac.service.LifeTimeFeeCreditCardService;

import jakarta.servlet.http.HttpServletResponse;

@Controller
public class LifeTimeFeeCreditCardController {

	@Autowired
	LifeTimeFeeCreditCardService lifeTimeFeeCreditCardService; 
	@Autowired
	CardRepo cardRepo;
	@Autowired
	LifeTimeFeeCreditCardRepo 	lifeTimeFeeCreditCardRepo;
	
	//lifetimefeecreditcard redirect page 
	@RequestMapping("/lifeTimeFreeCreditCard/{cardid}")
	public String rewardBenefits(@PathVariable("cardid") int cardid, Model model,HttpServletResponse response)
	{
		Card person = cardRepo.findById(cardid)
	            .orElseThrow(() -> new IllegalArgumentException("Invalid person id: " + cardid));
	        model.addAttribute("person", person);
		return "lifeTimeFreeCreditCard";
	}
	
	// cashback register data database and throw next page
		@RequestMapping("/lifeTimeFreeCreditCardRegister")
		public String balanceTransfersRegister(@RequestParam Card cardid,LifeTimeFeeCreditCard lifeTimeFeeCreditCard,Model model) 
		{
			lifeTimeFeeCreditCard.setCard(cardid);
			model.addAttribute("cardid", cardid.getCardid());
			System.out.println(lifeTimeFeeCreditCard);
			try {
				lifeTimeFeeCreditCardService.addDataRegister(lifeTimeFeeCreditCard);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			return "redirect:teamDashboard1";
		}
		
		
		
		// Reward Edit detail
				@GetMapping("/lifeTimeFree/edit/{id}")
			    public String showEditForm(@PathVariable("id") int id, Model model) {
			        LifeTimeFeeCreditCard person = lifeTimeFeeCreditCardRepo.findById(id)
			            .orElseThrow(() -> new IllegalArgumentException("Invalid person id: " + id));
			        model.addAttribute("person", person);
			        return "lifeTimeFreeCreditCardEditForm";
			    }

				@PostMapping("/lifeTimeFree/update/{id}")
				public String updatePerson(@ModelAttribute("person") LifeTimeFeeCreditCard person,@PathVariable("id") int id) {
					LifeTimeFeeCreditCard person1=lifeTimeFeeCreditCardRepo.findById(id).orElseThrow();
					person1.setNoAnnualFee(person.getNoAnnualFee());
					person1.setRenewalFee(person.getRenewalFee());
					person1.setIntrestCharge(person.getIntrestCharge());
					person1.setCashAdvanceCharge(person.getCashAdvanceCharge());
					person1.setWelcomeBonus(person.getWelcomeBonus());
					person1.setRewardsAndBonus(person.getRewardsAndBonus());
					person1.setSpecialPerks(person.getSpecialPerks());
					person1.setLoungeAcces(person.getLoungeAcces());
					person1.setInternationalTravel(person.getInternationalTravel());
					lifeTimeFeeCreditCardRepo.save(person1);
				  return "redirect:/teamDashboardDetails";
				}
		
}
