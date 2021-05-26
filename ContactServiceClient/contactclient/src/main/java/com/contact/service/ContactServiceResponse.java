
package com.contact.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contactServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contactServiceResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.contact.com/}contactServiceStub">
 *       &lt;sequence>
 *         &lt;element name="statusCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="faultResponse" type="{http://service.contact.com/}faultResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactServiceResponse", propOrder = {
    "statusCode",
    "status",
    "faultResponse"
})
public class ContactServiceResponse
    extends ContactServiceStub
{

    protected int statusCode;
    protected String status;
    protected FaultResponse faultResponse;

    /**
     * Gets the value of the statusCode property.
     * 
     */
    public int getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     */
    public void setStatusCode(int value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the faultResponse property.
     * 
     * @return
     *     possible object is
     *     {@link FaultResponse }
     *     
     */
    public FaultResponse getFaultResponse() {
        return faultResponse;
    }

    /**
     * Sets the value of the faultResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaultResponse }
     *     
     */
    public void setFaultResponse(FaultResponse value) {
        this.faultResponse = value;
    }

	@Override
	public String toString() {
		return "ContactServiceResponse [statusCode=" + statusCode + ", status=" + status + ", faultResponse="
				+ faultResponse + "]";
	}
}
