package com.contactclient;

import com.contact.service.Contact;
import com.contact.service.ContactServiceResponse;
import com.contact.serviceimpl.ContactPersistServiceImpl;
import com.contact.serviceimpl.ContactService;

/**
 * To Test Soap client Service
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		Contact contact = new Contact();
		contact.setId(0);
		contact.setName("Avinash Shivaji Lonkar");
		contact.setCountry("India");
		contact.setState("Maharashtra");
		contact.setCity("Navi Mumbai");
		contact.setPincode(400709);

		try {
			// soap client code
			ContactPersistServiceImpl contactPersistServiceImpl = new ContactPersistServiceImpl();
			ContactService contactService = contactPersistServiceImpl.getContactPersistPort();
			ContactServiceResponse contactServiceResponse = contactService.persistContact(contact);

			System.out.println(contactServiceResponse.toString());

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
