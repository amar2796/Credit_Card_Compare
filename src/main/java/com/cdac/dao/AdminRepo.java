package com.cdac.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cdac.model.Admin;
@Repository
public interface AdminRepo extends CrudRepository<Admin, String>{

}
