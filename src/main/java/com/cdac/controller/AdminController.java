package com.cdac.controller;

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
import com.cdac.model.Team;
import com.cdac.service.AdminService;



@Controller
public class AdminController {

	@Autowired
	AdminService adminService;
	
	//team login
	@RequestMapping("/adminLogin")
	public String adminLogin()
	{
		return "adminLogin";
	}
	
	//validate login data
	@GetMapping("/adminLoginValidate")
	public String adminLoginValidate(@RequestParam String userId, @RequestParam String password,Model model)
	{
		Optional<Admin> team=adminService.validateLogin(userId,password);
		if(team==null)
		{
			model.addAttribute("error", "* Please check Id, Password and Try again!");
			return "adminLogin";
		}
		else
		{
			return "adminDashboard";
		}
	}

}
