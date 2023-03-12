package com.cdac.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cdac.model.Contact;

@Repository
public interface ContactRepo extends CrudRepository<Contact, String> {

	
}
