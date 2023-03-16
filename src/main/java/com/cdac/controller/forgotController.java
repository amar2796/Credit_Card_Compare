package com.cdac.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cdac.model.Team;
import com.cdac.service.EmailService;
import com.cdac.service.TeamService;

@Controller
public class forgotController {

	//random OTP four digit
	public static int generateRandomNumber() {
        Random random = new Random();
        int min = 1000; // minimum 4-digit number
        int max = 9999; // maximum 4-digit number
        int randomNumber = random.nextInt(max - min + 1) + min;
        return randomNumber;
    }
	
	
	@Autowired
	TeamService teamService;
	
	@Autowired
	private EmailService emailService;

	@RequestMapping("/forgot")
	public String forgot() {
		return "forgot";
	}

	@PostMapping("/send-otp")
	public String sendOTP(@RequestParam("userid") String userid, Model model,@RequestParam("useremail") String useremail) {

		Team team = teamService.findByUserId(userid);
		if (team == null) {
			model.addAttribute("userCheck", "Please Enter currect UserId");
			return "forgot";
		}
		else if(!team.getEmail().equalsIgnoreCase(useremail)){
			model.addAttribute("userCheck", "Please Enter currect EmailId");
			return "forgot";
		}
		int otp=0;
		otp=generateRandomNumber();
		emailService.sendMail(team.getEmail(), team.getFullName(), otp);
		model.addAttribute("id", userid);
		model.addAttribute("error", "Successfully send Otp");
		model.addAttribute("otp",otp);
		return "forgotVerify";
	}

	@RequestMapping("/verifyPassword")
	public String verifyPassword(@RequestParam("id") String id, @RequestParam("useridFirst") String useridFirst,
			@RequestParam("otp") Integer otp,@RequestParam("userOtp") Integer userOtp , Model model) {
		if (userOtp.equals(otp)) {
			
			Team team = teamService.findByUserId(id);
			team.setPassword(useridFirst);
			teamService.AddRegisterData(team);
			model.addAttribute("error", "Password Updated");
			return "teamLogin";
		} else {
			model.addAttribute("userCheck", "Please try again!");
			return "forgot";
		}
	}

}
