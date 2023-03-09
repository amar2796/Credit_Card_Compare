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

import com.cdac.dao.BankRepo;
import com.cdac.dao.CardRepo;
import com.cdac.dao.FeesAndChargesRepo;
import com.cdac.model.Bank;
import com.cdac.model.Card;
import com.cdac.model.FeesAndCharges;
import com.cdac.model.LifeTimeFeeCreditCard;
import com.cdac.service.FeesAndChargesService;

import jakarta.servlet.http.HttpServletResponse;

@Controller
public class FeesAndChargesController {

	@Autowired
	FeesAndChargesService feesAndChargesService;
	
	
	@Autowired
	BankRepo bankRepo;
	@Autowired
	CardRepo cardRepo;
	@Autowired
	FeesAndChargesRepo feesAndChargesRepo;
	
		//feeAndChargesService redirect page 
		@RequestMapping("/feesAndCharges/{cardid}")
		public String rewardBenefits(@PathVariable("cardid") int cardid, Model model,HttpServletResponse response)
		{
			Card person = cardRepo.findById(cardid)
		            .orElseThrow(() -> new IllegalArgumentException("Invalid person id: " + cardid));
		        model.addAttribute("person", person);
		        System.out.println(model);
			return "feesAndCharges";
		}
	
	// feesAndCharges register data database and throw next page
			@RequestMapping("/feesAndChargesRegister")
			public String balanceTransfersRegister(@RequestParam Card cardid,FeesAndCharges feesAndCharges,Model model) 
			{
				feesAndCharges.setCard(cardid);
				model.addAttribute("cardid", cardid.getCardid());
				try {
					feesAndChargesService.addDataRegister(feesAndCharges);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
				return "redirect:teamDashboard1";
			}
			
			
			// feeandChargesform Edit detail
			@GetMapping("/feesAndCharges/edit/{id}")
		    public String showEditForm(@PathVariable("id") int id, Model model) {
				
				
				FeesAndCharges person = feesAndChargesRepo.findById(id).orElseThrow();
		        model.addAttribute("person", person);
		        return "feesAndChargesEditForm";
		    }
			
			//feeandChargesform update details
			@PostMapping("/feesAndCharges/update/{id}")
			public String updatePerson(@ModelAttribute("person") FeesAndCharges person, @PathVariable("id") int id) {
				FeesAndCharges person1=feesAndChargesRepo.findById(id).orElseThrow();
			
				person1.setNoAnnualFees(person.getNoAnnualFees());
				person1.setMembershipCharges(person.getMembershipCharges());
				person1.setCashbacks(person.getCashbacks());
				person1.setLowIntrest(person.getLowIntrest());
				person1.setTravel(person.getTravel());
				person1.setDomesticLounge(person.getDomesticLounge());
				person1.setInternationalLounge(person.getInternationalLounge());
				person1.setBalanceTransfer(person.getBalanceTransfer());
				person1.setInternationalTransaction(person.getInternationalTransaction());
				feesAndChargesRepo.save(person1);
			  return "redirect:/teamDashboardDetails";
			}
			
			
			// feeandChargesform detail delete
			@GetMapping("/feesAndCharges/delete/{id}")
		    public String showDeleteForm(@PathVariable("id") int id) {
				//System.out.println(id);
				feesAndChargesRepo.deleteById(id);
		        return "redirect:/teamDashboardDetails";
			}
			
			
		
}
