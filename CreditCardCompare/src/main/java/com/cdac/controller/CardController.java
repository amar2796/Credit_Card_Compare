package com.cdac.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cdac.dao.UserRepo;
import com.cdac.model.User;

@Controller
public class CardController {

	@Autowired
	UserRepo userRepo;
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
	@RequestMapping("/addRegister")
	public String getRegisterData(User user)
	{
		userRepo.save(user);
		System.out.println("data inserted");
		return "home";
	}
	@RequestMapping("/login")
	public String getLogin()
	{
		return "login";
	}
	@RequestMapping("/getUser")
	public String getData()
	{
		return "getUser";
	}
	@RequestMapping("/getUserData")
	public ModelAndView getUserData(@RequestParam String userId)
	{
		ModelAndView mv=new ModelAndView();
		Optional<User> user=userRepo.findById(userId);
		User user1=user.get();
		mv.addObject("user",user1);
		mv.setViewName("showUserData");
		return mv;
	}
}
