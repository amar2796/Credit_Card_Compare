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
	public Team validateLogin(String userId, String password) {
		try {
			Team team= teamRepo.findById(userId).get();
			if(team.getUserId().equals(userId))
			{
				if(team.getPassword().equals(password))
				{
					return team;
				}
					return null;
			}
		} catch (Exception e) {
			
		}
		return null;
	}
	
	
	

}
