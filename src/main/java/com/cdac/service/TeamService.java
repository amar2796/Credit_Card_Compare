package com.cdac.service;

import java.util.Optional;

import com.cdac.model.Team;

public interface TeamService {

	void AddRegisterData(Team team);

	Team validateLogin(String userId, String password);

}
