package com.contact.prototype;

import com.contact.stub.ContactServiceStub;

public interface PrototypeInterface {

	public static final String CONTACTSERVICERESPONSE = "ContactServiceResponse";
	public static final String CONTACT = "contact";
	public static final String FAULTRESPONSE = "faultResponse";
	public static final String CONTACTRESPONSEBUILDER = "contactResponseBuilder";

	public ContactServiceStub getObject(String objectName);
}
