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
import com.cdac.dao.RewardBenefitsRepo;
import com.cdac.model.Bank;
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
	@Autowired
	CardRepo cardRepo;
	@Autowired
	RewardBenefitsRepo rewardBenefitsRepo; 
	
	//reward&Benefits redirect page 
	@RequestMapping("/reward&Benefits/{cardid}")
	public String rewardBenefits(@PathVariable("cardid") int cardid, Model model,HttpServletResponse response)
	{
		Card person = cardRepo.findById(cardid)
	            .orElseThrow(() -> new IllegalArgumentException("Invalid person id: " + cardid));
	        model.addAttribute("person", person);
		return "reward&Benefits";
	}
	
	//rewardBenefitsRegister save data (registration page)
	@RequestMapping("/rewardBenefitsRegister")
	public String rewardBenefitsRegister(@RequestParam Card cardid, Model model,RewardBenefits rewardBenefits, HttpServletRequest request)
	{
		System.out.println(cardid);
		
		rewardBenefits.setCard(cardid);
		//model.addAttribute("cardid", cardid.getCardid());
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
		return "redirect:teamDashboard1";
	}
	
	// Reward Edit detail
		@GetMapping("/rewardAndBenefit/edit/{id}")
	    public String showEditForm(@PathVariable("id") int id, Model model) {
	        RewardBenefits person = rewardBenefitsRepo.findById(id)
	            .orElseThrow(() -> new IllegalArgumentException("Invalid person id: " + id));
	        model.addAttribute("person", person);
	        return "reward&BenefitsEditForm";
	    }

		@PostMapping("/rewardAndBenefit/update/{id}")
		public String updatePerson(@ModelAttribute("person") RewardBenefits person,@PathVariable("id") int id) {
			RewardBenefits person1=rewardBenefitsRepo.findById(id).orElseThrow();
			person1.setWelcomeBenefits(person.getWelcomeBenefits());
			person1.setRewardRates(person.getRewardRates());
			person1.setMovieDining(person.getMovieDining());
			person1.setDomesticLoungeAcces(person.getDomesticLoungeAcces());
			person1.setRewardPoints(person.getRewardPoints());
			person1.setTravel(person.getTravel());
			person1.setDomesticLounge(person.getDomesticLounge());
			person1.setInternationalLounge(person.getInternationalLounge());
			person1.setFuel(person.getFuel());
			rewardBenefitsRepo.save(person1);
		  return "redirect:/teamDashboardDetails";
		}
		
		
		// Bank detail delete
//		@GetMapping("/bankDetail/delete/{id}")
//	    public String showDeleteForm(@PathVariable("id") int id) {
//	        Bank person1 = bankRepo.findById(id)
//	            .orElseThrow(() -> new IllegalArgumentException("Invalid person id: " + id));
//	        bankRepo.deleteById(id);
//	        return "redirect:/teamDashboard1";
//		}
}
