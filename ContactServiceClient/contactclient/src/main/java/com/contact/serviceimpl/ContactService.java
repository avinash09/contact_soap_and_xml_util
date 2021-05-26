
package com.contact.serviceimpl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.contact.service.Contact;
import com.contact.service.ContactServiceResponse;
import com.contact.service.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ContactService", targetNamespace = "http://service.contact.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ContactService {


    /**
     * 
     * @param arg0
     * @return
     *     returns com.contact.service.ContactServiceResponse
     */
    @WebMethod(action = "addContact")
    @WebResult(name = "ServiceResponse", targetNamespace = "")
    @RequestWrapper(localName = "persistContact", targetNamespace = "http://service.contact.com/", className = "com.contact.service.PersistContact")
    @ResponseWrapper(localName = "persistContactResponse", targetNamespace = "http://service.contact.com/", className = "com.contact.service.PersistContactResponse")
    @Action(input = "addContact", output = "http://service.contact.com/ContactService/persistContactResponse")
    public ContactServiceResponse persistContact(
        @WebParam(name = "arg0", targetNamespace = "")
        Contact arg0);

}
