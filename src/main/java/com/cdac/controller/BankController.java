package com.cdac.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cdac.dto.CardDTO;
import com.cdac.model.Bank;
import com.cdac.service.BankService;

@Controller
public class BankController {

	@Autowired
	BankService bankService;
	
	//addBank page mapping
	@RequestMapping("/addBank")
	public String addBank()
	{
		return "addBank";
	}
	
	//bank register page mapping to addCardDashboard
	@RequestMapping("/addBankRegister")
	public String addCard(Bank bank, Model model)
	{
		bankService.addDataInBankTable(bank);
		return "redirect:teamDashboard1";
	}
//	@RequestMapping("/teamDashboard")
//    public String newPage(Model model) {
//		model.addAttribute("bank",bankRepo.findAll());
//        return "teamDashboard";
//    }
	
//	@RequestMapping("/bankdata")
//    public  ModelAndView getUsers() {
//        ArrayList<Bank> userList = (ArrayList<Bank>) bankRepo.findAll();
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("len", userList.size());
//        modelAndView.addObject("users", userList);
//        
//        modelAndView.setViewName("teamDashboard");
//        return modelAndView;
//    }
}
