package com.cdac.service;

import java.util.List;

import com.cdac.model.User;

public interface UserService {

	void registerData(User user);

	List<User> findAllUserEmail();

}
