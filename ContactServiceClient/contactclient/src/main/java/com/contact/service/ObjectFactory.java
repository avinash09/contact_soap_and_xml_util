
package com.contact.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.contact.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PersistContactResponse_QNAME = new QName("http://service.contact.com/", "persistContactResponse");
    private final static QName _ContactResponse_QNAME = new QName("http://service.contact.com/", "ContactResponse");
    private final static QName _Contact_QNAME = new QName("http://service.contact.com/", "Contact");
    private final static QName _PersistContact_QNAME = new QName("http://service.contact.com/", "persistContact");
    private final static QName _FaultResponse_QNAME = new QName("http://service.contact.com/", "faultResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.contact.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ContactServiceResponse }
     * 
     */
    public ContactServiceResponse createContactServiceResponse() {
        return new ContactServiceResponse();
    }

    /**
     * Create an instance of {@link PersistContactResponse }
     * 
     */
    public PersistContactResponse createPersistContactResponse() {
        return new PersistContactResponse();
    }

    /**
     * Create an instance of {@link FaultResponse }
     * 
     */
    public FaultResponse createFaultResponse() {
        return new FaultResponse();
    }

    /**
     * Create an instance of {@link PersistContact }
     * 
     */
    public PersistContact createPersistContact() {
        return new PersistContact();
    }

    /**
     * Create an instance of {@link Contact }
     * 
     */
    public Contact createContact() {
        return new Contact();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersistContactResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.contact.com/", name = "persistContactResponse")
    public JAXBElement<PersistContactResponse> createPersistContactResponse(PersistContactResponse value) {
        return new JAXBElement<PersistContactResponse>(_PersistContactResponse_QNAME, PersistContactResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.contact.com/", name = "ContactResponse")
    public JAXBElement<ContactServiceResponse> createContactResponse(ContactServiceResponse value) {
        return new JAXBElement<ContactServiceResponse>(_ContactResponse_QNAME, ContactServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Contact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.contact.com/", name = "Contact")
    public JAXBElement<Contact> createContact(Contact value) {
        return new JAXBElement<Contact>(_Contact_QNAME, Contact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersistContact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.contact.com/", name = "persistContact")
    public JAXBElement<PersistContact> createPersistContact(PersistContact value) {
        return new JAXBElement<PersistContact>(_PersistContact_QNAME, PersistContact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.contact.com/", name = "faultResponse")
    public JAXBElement<FaultResponse> createFaultResponse(FaultResponse value) {
        return new JAXBElement<FaultResponse>(_FaultResponse_QNAME, FaultResponse.class, null, value);
    }

}
