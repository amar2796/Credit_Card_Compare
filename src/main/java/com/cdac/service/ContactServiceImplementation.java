package com.cdac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.ContactRepo;
import com.cdac.model.Contact;

@Service
public class ContactServiceImplementation implements ContactService {

	@Autowired
	private ContactRepo contactRepo;

	@Override
	public void registerContact(Contact contact) {

		contactRepo.save(contact);
	}

	@Override
	public List<Contact> findAllDetails() {

		return (List<Contact>) contactRepo.findAll();
	}

}
