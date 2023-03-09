package com.cdac.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cdac.dao.BalanceTransferRepo;
import com.cdac.dao.BankRepo;
import com.cdac.dao.CardRepo;
import com.cdac.dao.FeesAndChargesRepo;
import com.cdac.dao.LifeTimeFeeCreditCardRepo;
import com.cdac.dao.RewardBenefitsRepo;
import com.cdac.model.Bank;
import com.cdac.model.Team;
import com.cdac.service.TeamService;

@Controller

public class TeamController {
	
	@Autowired
	TeamService teamService;
	@Autowired
	BankRepo bankRepo;
	@Autowired
	RewardBenefitsRepo rewardBenefitsRepo;
	@Autowired
	BalanceTransferRepo balanceTransfersRepo;
	@Autowired
	com.cdac.dao.cashbacksRepo cashbacksRepo;
	@Autowired
	LifeTimeFeeCreditCardRepo lifeTimeFeeCreditCardRepo;
	@Autowired
	CardRepo cardRepo;
	@Autowired
	FeesAndChargesRepo  feesAndChargesRepo;
	
	// Team register form
	@RequestMapping("/teamRegister")
	public String teamRegister()
	{
		return "teamRegister";
	}
	
	//team register data in database
	@RequestMapping("/teamAddRegister")
	public String teamAddRegister(Team team)
	{
		teamService.AddRegisterData(team);
		return "home";
	}
	
	//team login 
	@RequestMapping("/teamLogin")
	public String teamLogin()
	{
		return "teamLogin";
	}
	
	//validate login data
	@GetMapping("/teamLoginValidate")
	public String teamLoginValidate(@RequestParam String userId, @RequestParam String password,Model model)
	{
		Optional<Team> team=teamService.validateLogin(userId,password);
		if(team==null)
		{
			model.addAttribute("error", "* Please check Id, Password and Try again!");
			return "teamLogin";
		}
		else
		{
			//List<RewardBenefits> list= rewardBenefitsRepo.findByRewardBenefits();
			//System.out.println(list);
			//model.addAttribute("rewards", rewardBenefitsRepo.findByTable());
			
			return "redirect:/teamDashboard1";
		}
	}
	
	
	// Bank Edit detail
	@GetMapping("/bankDetail/edit/{id}")
    public String showEditForm(@PathVariable("id") int id, Model model) {
        Bank person = bankRepo.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Invalid person id: " + id));
        model.addAttribute("person", person);
        return "bankDetailEdit";
    }

	@PostMapping("/bankDetail/update")
	public String updatePerson(@ModelAttribute("person") Bank person) {
		bankRepo.save(person);
	  return "redirect:/teamDashboard1";
	}
	
	
	// Bank detail delete
	@GetMapping("/bankDetail/delete/{id}")
    public String showDeleteForm(@PathVariable("id") int id) {
        Bank person1 = bankRepo.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Invalid person id: " + id));
        bankRepo.deleteById(id);
        return "redirect:/teamDashboard1";
	}
	
	//home page divert
	@RequestMapping("/teamDashboard1")
	public String teamDashboard(Model model) {
		model.addAttribute("bank",bankRepo.findAll());
		model.addAttribute("card", cardRepo.findAll());
	
		return "teamDashboard";
	}
	
	
	//view add dashboard details
	@RequestMapping("/teamDashboardDetails")
	public String teamDashboardDetails(Model model)
	{
		model.addAttribute("rewardBenefit", rewardBenefitsRepo.findAll());
		model.addAttribute("balanceTransfer", balanceTransfersRepo.findAll());
		model.addAttribute("cashback", cashbacksRepo.findAll());
		model.addAttribute("lifeTimeFree", lifeTimeFeeCreditCardRepo.findAll());
		model.addAttribute("feesAndCharges", feesAndChargesRepo.findAll());
	
		return "teamDashboardView";
	}
	
	//back button to back to team dashboard
	@RequestMapping("/backTeamDashboard")
	public String backTeamDashboard()
	{
		return "redirect:teamDashboard1";
	}
}
