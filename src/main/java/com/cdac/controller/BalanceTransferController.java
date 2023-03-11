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

import com.cdac.dao.BalanceTransferRepo;
import com.cdac.dao.CardRepo;
import com.cdac.model.BalanceTransfers;
import com.cdac.model.Card;
import com.cdac.model.RewardBenefit;
import com.cdac.service.BalanceTransferService;

import jakarta.servlet.http.HttpServletResponse;

@Controller
public class BalanceTransferController {

	@Autowired
	BalanceTransferService balanceTransferService;
	@Autowired
	CardRepo cardRepo;
	@Autowired
	BalanceTransferRepo balanceTransferRepo;
	
	//reward&Benefits redirect page 
	@RequestMapping("/balanceTransfers/{cardid}")
	public String rewardBenefits(@PathVariable("cardid") int cardid, Model model,HttpServletResponse response)
	{
		Card person = cardRepo.findById(cardid)
	            .orElseThrow(() -> new IllegalArgumentException("Invalid person id: " + cardid));
	        model.addAttribute("person", person);
		return "balanceTransfers";
	}
	
	@RequestMapping("/balanceTransfersRegister")
	public String balanceTransfersRegister(@RequestParam Card cardid,BalanceTransfers balanceTransfers,Model model) 
	{
		balanceTransfers.setCard(cardid);
//		model.addAttribute("cardid", cardid.get);
		try {
			balanceTransferService.addDataRegister(balanceTransfers);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return "redirect:teamDashboard1";
	}
	
	// Reward Edit detail
			@GetMapping("/balanceTransfer/edit/{id}")
		    public String showEditForm(@PathVariable("id") int id, Model model) {
		        BalanceTransfers person = balanceTransferRepo.findById(id)
		            .orElseThrow(() -> new IllegalArgumentException("Invalid person id: " + id));
		        model.addAttribute("person", person);
		        return "balanceTransfersEditForm";
		    }

			@PostMapping("/balanceTransfer/update/{id}")
			public String updatePerson(@ModelAttribute("person") BalanceTransfers person,@PathVariable("id") int id) {
				BalanceTransfers person1=balanceTransferRepo.findById(id).orElseThrow();
				person1.setIntrestFreePeriod(person.getIntrestFreePeriod());
				person1.setPostBalanceTransfer(person.getPostBalanceTransfer());
				person1.setZeroPercentBalanceTransfer(person.getZeroPercentBalanceTransfer());
				person1.setEmiPayment(person.getEmiPayment());
				person1.setPerpetualBalanceTransfer(person.getPerpetualBalanceTransfer());
				person1.setTravel(person.getTravel());
				person1.setDomesticLounge(person.getDomesticLounge());
				person1.setInternationalLounge(person.getInternationalLounge());
				person1.setFuels(person.getFuels());
				balanceTransferRepo.save(person1);
			  return "redirect:/teamDashboardDetails";
			}
	
	
	
	
}
