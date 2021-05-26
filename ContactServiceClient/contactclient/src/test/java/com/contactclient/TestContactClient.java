package com.contactclient;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.contact.service.Contact;
import com.contact.service.ContactServiceResponse;
import com.contact.serviceimpl.ContactPersistServiceImpl;
import com.contact.serviceimpl.ContactService;

public class TestContactClient {

	@Test
	public void testContactService() {
		Contact contact = new Contact();
		contact.setId(101);
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

			assertEquals(200, contactServiceResponse.getStatusCode());

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testContactServiceInvalid() {
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

			assertEquals("Contact Id Should not be 0.", contactServiceResponse.getFaultResponse().getFaultDescription());

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
