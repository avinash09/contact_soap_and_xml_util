package com.contact;

import javax.xml.ws.Endpoint;

import com.contact.serviceimpl.ContactServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Endpoint e=Endpoint.publish("http://localhost:8989/ws/contactservice", new ContactServiceImpl());
        System.out.println(e.isPublished());
    }
}
