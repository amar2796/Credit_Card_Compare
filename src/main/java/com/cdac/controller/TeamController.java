package com.cdac.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cdac.model.Team;
import com.cdac.service.TeamService;

@Controller
public class TeamController {
	
	@Autowired
	TeamService teamService;
	
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
			return "teamDashboard";
		}
	}
	
	
}
