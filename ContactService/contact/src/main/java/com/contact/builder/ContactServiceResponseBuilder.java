package com.contact.builder;

import com.contact.prototype.Prototype;
import com.contact.prototype.PrototypeInterface;
import com.contact.stub.ContactServiceResponse;
import com.contact.stub.ContactServiceStub;
import com.contact.stub.FaultResponse;

public class ContactServiceResponseBuilder extends ContactServiceStub {

	private int statusCode;

	private String status;

	private int faultCode;

	private String faultMessage;

	private String faultDescription;

	public static ContactServiceResponseBuilder instance() throws CloneNotSupportedException {
		return (ContactServiceResponseBuilder) new Prototype().getObject(PrototypeInterface.CONTACTRESPONSEBUILDER);
	}

	public ContactServiceResponseBuilder statusCode(int statusCode) {
		this.statusCode = statusCode;
		return this;
	}

	public ContactServiceResponseBuilder status(String status) {
		this.status = status;
		return this;
	}

	public ContactServiceResponseBuilder faultCode(int faultCode) {
		this.faultCode = faultCode;
		return this;
	}

	public ContactServiceResponseBuilder faultMessage(String faultMessage) {
		this.faultMessage = faultMessage;
		return this;
	}

	public ContactServiceResponseBuilder faultDescription(String faultDescription) {
		this.faultDescription = faultDescription;
		return this;
	}

	public ContactServiceResponse build() {

		ContactServiceResponse contactServiceResponse = (ContactServiceResponse) new Prototype()
				.getObject(PrototypeInterface.CONTACTSERVICERESPONSE);

		FaultResponse faultResponse = (FaultResponse) new Prototype().getObject(PrototypeInterface.FAULTRESPONSE);

		faultResponse.setFaultCode(this.faultCode);
		faultResponse.setFaultDescription(this.faultDescription);
		faultResponse.setFaultMessage(this.faultMessage);

		contactServiceResponse.setFaultResponse(faultResponse);
		contactServiceResponse.setStatus(this.status);
		contactServiceResponse.setStatusCode(this.statusCode);

		return contactServiceResponse;

	}

}
