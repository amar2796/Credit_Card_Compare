package com.cdac.controller;


import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cdac.model.Team;
import com.cdac.service.TeamService;





@Controller
public class forgotController {
	
	@Autowired 
	TeamService teamService;

	
	
	@RequestMapping("/forgot")
	public String forgot() {
		return "forgot";
	}
	
	@PostMapping("/send-otp")
	public String sendOTP(@RequestParam("userid") String userid, Model model ) {

			Team team=teamService.findByUserId(userid);
			if(team==null)
			{
				model.addAttribute("userCheck", "Please Enter currect UserId");
				return "forgot";
			}

			model.addAttribute("id", userid);
		return "forgotVerify";
	}
	
	@RequestMapping("/verifyPassword")
	public  String verifyPassword(@RequestParam("id") String id, @RequestParam("useridFirst") String useridFirst,@RequestParam("useridSecond") String
			useridSecond, Model model) {
			if(useridFirst.equals(useridSecond)) {
				Team team=teamService.findByUserId(id);
				team.setPassword(useridSecond);
				teamService.AddRegisterData(team);
				model.addAttribute("error", "Password Updated");
				return "teamLogin";
			}
			else {
				model.addAttribute("id", id);
				model.addAttribute("error", "Please enter same password");
				return "forgotVerify";
			}
	}
	
	
	
	
}

