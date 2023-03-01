package com.cdac.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cdac.dao.UserRepo;
import com.cdac.model.User;
import com.cdac.service.UserService;

@Controller
public class userController {

	@Autowired
	UserService userService;
	@RequestMapping("/home")
	public String getHome()
	{
		return "home";
	}
	@RequestMapping("/register")
	public String getRegister()
	{
		return "register";
	}
	//user registration form
	@RequestMapping("/userRegister")
	public String userRegister()
	{
		return "userRegister";
	}
	
	// register detail in database
	@RequestMapping("/userAddRegister")
	public String getRegisterData(User user)
	{
		userService.registerData(user);
		return "home";
	}
	
	// login dashboard
	@RequestMapping("/login")
	public String getLogin()
	{
		return "login";
	}
	
	
	//View Card page
	@RequestMapping("/viewCard")
	public String viewCard()
	{
		return "ViewCard";
	}
	
	//Contact page mapping
	@RequestMapping("/contact")
	public String contactPage(Model model)
	{
		return "contact";
	}
	
	
	
	//about page mapping
	@RequestMapping("/about")
	public String about()
	{
		return "about";
	}
	
	
}
