package com.cdac.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.model.Admin;
import com.cdac.model.Bank;
import com.cdac.model.Card;
import com.cdac.model.Team;
import com.cdac.model.User;
import com.cdac.service.AdminService;
import com.cdac.service.BankService;
import com.cdac.service.CardService;
import com.cdac.service.ContactService;
import com.cdac.service.EmailService;
import com.cdac.service.TeamService;
import com.cdac.service.UserService;

@Controller
public class AdminController {

	private static final boolean True = false;

	@Autowired
	AdminService adminService;

	@Autowired
	BankService bankService;

	@Autowired
	CardService cardService;

	@Autowired
	ContactService contactService;

	@Autowired
	TeamService teamService;
	
	@Autowired
	EmailService emailService;
	
	@Autowired
	UserService userService;

	// team login
	@RequestMapping("/adminLogin")
	public String adminLogin() {
		return "adminLogin";
	}

	// validate login data
	@GetMapping("/adminLoginValidate")
	public String adminLoginValidate(@RequestParam String userId, @RequestParam String password, Model model) {
		Optional<Admin> team = adminService.validateLogin(userId, password);
		if (team == null) {
			model.addAttribute("error", "* Please check Id, Password and Try again!");
			return "adminLogin";
		} else {
			return "redirect:/adminDashboardControl";
		}
	}

	// admin dashboard controller
	@RequestMapping("/adminDashboardControl")
	public String adminDashboardControl(Model model) {
		model.addAttribute("bank", bankService.getApprovedBanks(false));
		model.addAttribute("card", cardService.getCardsByStatus(false));
		model.addAttribute("contacts", contactService.findAllDetails());
		model.addAttribute("teamPending", teamService.getApprovedTeams(false));
		model.addAttribute("teamAccept", teamService.getApprovedTeams(true));
		return "adminDashboard";
	}

	// Accept Bank
	@RequestMapping("/bankStatusAccept/{id}")
	public String bankStatusAccept(@PathVariable Integer id) {
		Bank bank = bankService.getBank(id).get();
		bank.setIsApproved(true);
		bankService.addDataInBankTable(bank);
		return "redirect:/adminDashboardControl";
	}

	// Accept Card
	@RequestMapping("/cardStatusAccept/{id}")
	public String cardStatusAccept(@PathVariable Integer id) {
		Card card = cardService.getCard(id).get();
		card.setIsApproved(true);
		cardService.saveCard(card);
		
		//send email all user to notify add a card
		
		List<User> user=userService.findAllUserEmail();
		List<String> list = new ArrayList<String>();
		for(User name:user) {
			 list.add(name.getEmail());
		}
		String[] UserList= list.toArray(new String[list.size()]);
		emailService.sendEmailAllUser(UserList,card);
		
		
		return "redirect:/adminDashboardControl";
	}

	// Accept team
	@RequestMapping("/teamStatusAccept/{id}")
	public String teamStatusAccept(@PathVariable String id) {
		Team team = teamService.getTeam(id);
		team.setApproved(true);
		emailService.sendMailAcceptTeam(team);
		teamService.AddRegisterData(team);
		return "redirect:/adminDashboardControl";
	}

	// reject team
	@RequestMapping("/teamStatusReject/{id}")
	public String teamStatusReject(@PathVariable String id) {
		teamService.deleteById(id);
		return "redirect:/adminDashboardControl";
	}
	

	
	public List<String> UserList() {
		List<User> user=userService.findAllUserEmail();
		List<String> list = new ArrayList<String>();
		for(User name:user) {
			 list.add(name.getEmail());
		}
		return list;
	}
	

}
