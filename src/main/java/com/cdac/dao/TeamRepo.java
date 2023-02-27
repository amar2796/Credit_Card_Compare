package com.cdac.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cdac.model.Team;

@Repository
public interface TeamRepo extends CrudRepository<Team, String> {

}
