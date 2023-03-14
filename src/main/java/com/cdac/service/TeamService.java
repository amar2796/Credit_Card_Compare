package com.cdac.service;

import java.util.List;
import java.util.Optional;

import com.cdac.model.Admin;
import com.cdac.model.Team;

public interface TeamService {

	void AddRegisterData(Team team);

	Team validateLogin(String userId, String password);

	Team findByUserId(String userid);

	List<Team> getApprovedTeams(boolean b);

	Team getTeam(String id);

	void deleteById(String id);

}
