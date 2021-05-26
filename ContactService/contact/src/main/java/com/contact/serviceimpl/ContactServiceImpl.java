package com.contact.serviceimpl;

import javax.jws.WebService;

import com.contact.builder.ContactServiceResponseBuilder;
import com.contact.service.ContactServiceInterface;
import com.contact.stub.Contact;
import com.contact.stub.ContactServiceResponse;

@WebService(endpointInterface = "com.contact.service.ContactServiceInterface", portName = "ContactPersistPort", serviceName = "ContactPersistServiceImpl")
public class ContactServiceImpl implements ContactServiceInterface {

	public ContactServiceResponse saveContact(Contact contact) {
		System.out.println("Service >> ContactServiceImpl >> saveContact >> Contact:" + contact.toString());
		ContactServiceResponse serviceResponse = null;
		try {
			ContactServiceResponseBuilder serviceResponseBuilder = ContactServiceResponseBuilder.instance();

			if (contact.getId() == 0) {
				serviceResponse = serviceResponseBuilder.faultCode(001).faultMessage("CONTACT_ID_NULL")
						.faultDescription("Contact Id Should not be 0.").build();
				return serviceResponse;
			}

			serviceResponse = serviceResponseBuilder.statusCode(200).status("contact saved successfully").build();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return serviceResponse;

	}

	public Contact fetchContact(String contactName) {
		// TODO Auto-generated method stub
		return null;
	}

}
