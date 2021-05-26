package com.contact.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class FaultResponse extends ContactServiceStub {

	@XmlElement(name = "faultCode")
	private int faultCode;

	@XmlElement(name = "faultMessage")
	private String faultMessage;

	@XmlElement(name = "faultDescription")
	private String faultDescription;

	public FaultResponse() {
		super();
	}

	public FaultResponse(int faultCode, String faultMessage, String faultDescription) {
		super();
		this.faultCode = faultCode;
		this.faultMessage = faultMessage;
		this.faultDescription = faultDescription;
	}

	public int getFaultCode() {
		return faultCode;
	}

	public void setFaultCode(int faultCode) {
		this.faultCode = faultCode;
	}

	public String getFaultMessage() {
		return faultMessage;
	}

	public void setFaultMessage(String faultMessage) {
		this.faultMessage = faultMessage;
	}

	public String getFaultDescription() {
		return faultDescription;
	}

	public void setFaultDescription(String faultDescription) {
		this.faultDescription = faultDescription;
	}
}
