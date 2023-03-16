package com.cdac.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.AdminRepo;
import com.cdac.model.Admin;
import com.cdac.model.Team;

@Service
public class AdminServiceImplementation implements AdminService {

	@Autowired
	AdminRepo adminRepo;

	@Override
	public Admin registerData(Admin admin) {
		adminRepo.save(admin);
		return admin;
	}

	@Override
	public String login(String userId, String userPassword) {
		Optional<Admin> id = adminRepo.findById(userId);
		if (id.get().getUserPassword().equals(userPassword)) {
			return "LoginSuccessfully";
		} else {
			return "id or password mismatch";
		}

	}

	@Override
	public Optional<Admin> validateLogin(String userId, String password) {
		try {
			Optional<Admin> admin = adminRepo.findById(userId);
			if (admin.get().getUserId().equals(userId)) {
				if (admin.get().getUserPassword().equals(password)) {
					return admin;
				}
				return null;
			}
		} catch (Exception e) {

		}
		return null;
	}
}
