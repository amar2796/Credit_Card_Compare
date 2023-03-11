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
import com.cdac.model.FeesAndCharge;
import com.cdac.model.LifeTimeFeeCreditCard;
import com.cdac.service.CardService;
import com.cdac.service.FeesAndChargesService;

import jakarta.servlet.http.HttpServletResponse;

@Controller
public class FeesAndChargesController {

	@Autowired
	FeesAndChargesService feesAndChargesService;
	
	@Autowired
	CardService cardService;
	
	
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
			Card card = cardRepo.findById(cardid)
		            .orElseThrow(() -> new IllegalArgumentException("Invalid card id: " + cardid));
		        model.addAttribute("card", card);
		        System.out.println(model);
			return "feesAndCharges";
		}
	
	// feesAndCharges register data database and throw next page
			@RequestMapping("/feesAndChargesRegister")
			public String balanceTransfersRegister(@RequestParam Integer cardid,FeesAndCharge feesAndCharges,Model model) 
			{
				System.out.println(cardid);
				System.out.println(feesAndCharges);
				feesAndChargesService.addDataRegister(feesAndCharges);
				
				Card card = cardService.getCard(cardid).get();
				card.setFeesAndCharge(feesAndCharges);
				cardService.saveCard(card);
//				feesAndCharges.setCard(cardid);
//				model.addAttribute("cardid", cardid.getCardid());
//				try {
//					feesAndChargesService.addDataRegister(feesAndCharges);
//				} catch (Exception e) {
//					System.out.println(e.getMessage());
//				}
//				
				return "redirect:teamDashboard1";
			}
			
			
			// feeandChargesform Edit detail
			@GetMapping("/feesAndCharges/edit/{id}")
		    public String showEditForm(@PathVariable("id") int id, Model model) {
				
				System.out.println(id);
				FeesAndCharge feesAndCharge = feesAndChargesService.getFeesAndCharge(id).get();
		        model.addAttribute("feesAndCharge", feesAndCharge);
		        return "feesAndChargesEditForm";
				
		    }
			
			//feeandChargesform update details
			@PostMapping("/feesAndCharges/update/")
			public String updatePerson(@ModelAttribute("feesAndCharge") FeesAndCharge feesAndCharge) {
				
				feesAndChargesService.addDataRegister(feesAndCharge);
				//				FeesAndCharge charges=feesAndChargesRepo.findById(id).orElseThrow();
//
//				
//			
//				charges.setNoAnnualFees(feesAndCharges.getNoAnnualFees());
//				charges.setMembershipCharges(feesAndCharges.getMembershipCharges());
//				charges.setCashbacks(feesAndCharges.getCashbacks());
//				charges.setLowIntrest(feesAndCharges.getLowIntrest());
//				charges.setTravel(feesAndCharges.getTravel());
//				charges.setDomesticLounge(feesAndCharges.getDomesticLounge());
//				charges.setInternationalLounge(feesAndCharges.getInternationalLounge());
//				charges.setBalanceTransfer(feesAndCharges.getBalanceTransfer());
//				charges.setInternationalTransaction(feesAndCharges.getInternationalTransaction());
//				feesAndChargesRepo.save(charges);
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
