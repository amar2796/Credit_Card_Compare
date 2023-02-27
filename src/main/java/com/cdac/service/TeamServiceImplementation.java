package com.cdac.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.TeamRepo;
import com.cdac.model.Team;

@Service
public class TeamServiceImplementation implements TeamService{

	@Autowired
	TeamRepo teamRepo;
	@Override
	public void AddRegisterData(Team team) {
		teamRepo.save(team);
	}
	@Override
	public Optional<Team> validateLogin(String userId, String password) {
		try {
			Optional<Team> team= teamRepo.findById(userId);
			if(team.get().getUserId().equals(userId))
			{
				return team;	
			}
		} catch (Exception e) {
			
		}
		return null;
	}
	
	
	

}
