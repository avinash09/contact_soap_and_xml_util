package com.contact.service;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.contact.stub.Contact;
import com.contact.stub.ContactServiceResponse;

@WebService(name="ContactService", targetNamespace="http://service.contact.com/")
public interface ContactServiceInterface {

	@WebMethod(action="addContact", operationName="persistContact")
	@WebResult(name="ServiceResponse")
	public ContactServiceResponse saveContact(Contact contact);
	
	@WebMethod(exclude=true)
	public Contact fetchContact(String contactName);

}
