package com.cdac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.model.Admin;
import com.cdac.service.AdminService;



@RestController
public class AdminController {

	@Autowired
	AdminService adminService;
	
	//Admin Register to database
	@PostMapping("/adminRegister")
	public Admin Register(@RequestBody Admin admin)
	{
		return adminService.registerData(admin);
		
	}
	
	//Admin login
	@GetMapping("/adminLogin/{userId}&{userPassword}")
	public String Login(@PathVariable String userId, @PathVariable String userPassword)
	{
		return adminService.login(userId,userPassword);
		
	}
}
