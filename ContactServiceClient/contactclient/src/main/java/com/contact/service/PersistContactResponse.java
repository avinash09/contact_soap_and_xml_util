
package com.contact.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for persistContactResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persistContactResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceResponse" type="{http://service.contact.com/}contactServiceResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persistContactResponse", propOrder = {
    "serviceResponse"
})
public class PersistContactResponse {

    @XmlElement(name = "ServiceResponse")
    protected ContactServiceResponse serviceResponse;

    /**
     * Gets the value of the serviceResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ContactServiceResponse }
     *     
     */
    public ContactServiceResponse getServiceResponse() {
        return serviceResponse;
    }

    /**
     * Sets the value of the serviceResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactServiceResponse }
     *     
     */
    public void setServiceResponse(ContactServiceResponse value) {
        this.serviceResponse = value;
    }

}
