package com.cdac.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cdac.model.Team;

@Repository
public interface TeamRepo extends CrudRepository<Team, String> {

	Team findByUserId(String userid);

	@Query("SELECT c FROM Team c WHERE c.isApproved = ?1")
	List<Team> getApprovedTeams(boolean b);

}
