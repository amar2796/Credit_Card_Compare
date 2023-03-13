package com.cdac.service;


import java.util.List;

import com.cdac.model.Contact;

public interface ContactService {

	void registerContact(Contact contact);

	List<Contact> findAllDetails();

}
