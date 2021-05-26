package com.contact.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ContactResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class ContactServiceResponse extends ContactServiceStub {
	
	@XmlElement
	private int statusCode;

	private String status;
	
	@XmlElement
	private FaultResponse faultResponse;

	public ContactServiceResponse() {
		super();
	}

	public ContactServiceResponse(int statusCode, String status, FaultResponse faultResponse) {
		super();
		this.statusCode = statusCode;
		this.status = status;
		this.faultResponse = faultResponse;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public FaultResponse getFaultResponse() {
		return faultResponse;
	}

	public void setFaultResponse(FaultResponse faultResponse) {
		this.faultResponse = faultResponse;
	}
}
