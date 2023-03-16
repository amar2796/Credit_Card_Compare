package com.cdac.controller;

import java.util.Optional;

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
import com.cdac.model.RewardBenefit;
import com.cdac.service.CardService;
import com.cdac.service.RewardBenefitsService;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class RewardBenefitsController {

	@Autowired
	private CardService cardService;

	@Autowired
	RewardBenefitsService rewardBenefitsService;
	@Autowired
	CardRepo cardRepo;
	@Autowired
	RewardBenefitsRepo rewardBenefitsRepo;

	// reward&Benefits redirect page
	@RequestMapping("/reward&Benefits/{cardid}")
	public String rewardBenefits(@PathVariable("cardid") int cardid, Model model, HttpServletResponse response) {
		Card card = cardRepo.findById(cardid)
				.orElseThrow(() -> new IllegalArgumentException("Invalid card id: " + cardid));
		model.addAttribute("card", card);
//	        System.out.println(person.getCard_type());
		return "reward&Benefits";
	}

	// rewardBenefitsRegister save data (registration page)
	@RequestMapping("/rewardBenefitsRegister")
	public String rewardBenefitsRegister(@RequestParam Integer cardid, Model model, RewardBenefit rewardBenefits,
			HttpServletRequest request) {
		rewardBenefitsService.registerData(rewardBenefits);
		Card card = cardService.getCard(cardid).get();
		card.setRewardBenefit(rewardBenefits);
		cardService.saveCard(card);
//		rewardBenefits.setCard(cardid);
		// model.addAttribute("cardid", cardid.getCardid());
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
		// rewardBenefitsService.registerData(rewardBenefits);
		return "redirect:teamDashboard1";
	}

	// Reward Edit detail
	@GetMapping("/rewardAndBenefit/edit/{id}")
	public String showEditForm(@PathVariable("id") int id, Model model) {
		RewardBenefit rewardBenefit = rewardBenefitsService.findById(id).get();
		model.addAttribute("rewardBenefit", rewardBenefit);
		return "reward&BenefitsEditForm";
	}

	@PostMapping("/rewardAndBenefit/update/")
	public String updatePerson(@ModelAttribute("rewardBenefit") RewardBenefit rewardBenefit) {
		rewardBenefitsService.registerData(rewardBenefit);
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
