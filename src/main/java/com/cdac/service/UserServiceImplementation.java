package com.cdac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.UserRepo;
import com.cdac.model.User;
@Service
public class UserServiceImplementation implements UserService{

	@Autowired
	UserRepo userRepo;
	
	@Override
	public void registerData(User user) {
		userRepo.save(user);
	}

	@Override
	public List<User> findAllUserEmail() {
		List<User> user=(List<User>) userRepo.findAll();
		return user;
	}

	

}
