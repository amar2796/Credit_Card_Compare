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
import com.cdac.dao.cashbacksRepo;
import com.cdac.model.BalanceTransfers;
import com.cdac.model.Card;
import com.cdac.model.Cashbacks;
import com.cdac.model.RewardBenefit;
import com.cdac.service.CashbacksService;

import jakarta.servlet.http.HttpServletResponse;

@Controller
public class CashbacksController {

	@Autowired
	CashbacksService cashbacksService;
	@Autowired
	CardRepo cardRepo;
	@Autowired
	cashbacksRepo cashbacksRepo;

	// cashback redirect page
	@RequestMapping("/cashbacks/{cardid}")
	public String rewardBenefits(@PathVariable("cardid") int cardid, Model model, HttpServletResponse response) {
		Card person = cardRepo.findById(cardid)
				.orElseThrow(() -> new IllegalArgumentException("Invalid person id: " + cardid));
		model.addAttribute("person", person);
		return "cashbacks";
	}

	// cashback register data database and throw next page
	@RequestMapping("/cashbacksRegister")
	public String balanceTransfersRegister(@RequestParam Card cardid, Cashbacks cashbacks, Model model) {
		cashbacks.setCard(cardid);
//		model.addAttribute("cardid", cardid.getCardid());
		System.out.println(cashbacks);
		try {
			cashbacksService.addDataRegister(cashbacks);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return "redirect:teamDashboard1";
	}

	// Reward Edit detail
	@GetMapping("/cashbacks/edit/{id}")
	public String showEditForm(@PathVariable("id") int id, Model model) {
		Cashbacks person = cashbacksRepo.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Invalid person id: " + id));
		model.addAttribute("person", person);
		return "cashbacksEditForm";
	}

	@PostMapping("/cashbacks/update/{id}")
	public String updatePerson(@ModelAttribute("person") Cashbacks person, @PathVariable("id") int id) {
		Cashbacks person1 = cashbacksRepo.findById(id).orElseThrow();

		person1.setWelcomeBenefits(person.getWelcomeBenefits());
		person1.setWelcomeBenefits(person.getWelcomeBenefits());
		person1.setMilestoneBenefits(person.getMilestoneBenefits());
		person1.setTravelBenefits(person.getTravelBenefits());
		person1.setMoviesAndDiningBenefits(person.getMoviesAndDiningBenefits());
		person1.setRewardsAndFeatures(person.getRewardsAndFeatures());
		person1.setOnlineSpends(person.getOnlineSpends());
		person1.setOfflineSpends(person.getOfflineSpends());
		person1.setFuels(person.getFuels());
		person1.seteCommerceCashbacks(person.geteCommerceCashbacks());
		cashbacksRepo.save(person1);
		return "redirect:/teamDashboardDetails";
	}

}
