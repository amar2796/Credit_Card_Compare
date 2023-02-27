package com.cdac.service;

import java.util.Optional;

import com.cdac.model.Admin;
import com.cdac.model.Team;

public interface AdminService {

	public Admin registerData(Admin admin);

	
	public String login(String userId,String userPassword);


	public Optional<Admin> validateLogin(String userId, String password);


}
