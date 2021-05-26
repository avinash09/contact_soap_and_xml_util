package com.contact.prototype;

import java.util.HashMap;

import com.contact.builder.ContactServiceResponseBuilder;
import com.contact.stub.Contact;
import com.contact.stub.ContactServiceResponse;
import com.contact.stub.ContactServiceStub;
import com.contact.stub.FaultResponse;

public class Prototype implements PrototypeInterface {

	private static HashMap<String, ContactServiceStub> objectsMap = new HashMap<String, ContactServiceStub>();

	static {
		objectsMap.put(CONTACTSERVICERESPONSE, new ContactServiceResponse());
		objectsMap.put(CONTACT, new Contact());
		objectsMap.put(FAULTRESPONSE, new FaultResponse());
		objectsMap.put(CONTACTRESPONSEBUILDER, new ContactServiceResponseBuilder());
	}

	public ContactServiceStub getObject(String objectName) {
		ContactServiceStub contactServiceStub = null;
		try {
			contactServiceStub = (ContactServiceStub) objectsMap.get(objectName).clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return contactServiceStub;
	}

}
