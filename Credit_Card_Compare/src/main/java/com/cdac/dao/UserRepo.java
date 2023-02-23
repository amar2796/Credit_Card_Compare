package com.cdac.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cdac.model.User;


@Repository
public interface UserRepo extends CrudRepository<User, String>
{
	
}
