package com.cdac.service;

import com.cdac.model.Admin;

public interface AdminService {

	public Admin registerData(Admin admin);

	
	public String login(String userId,String userPassword);


}
