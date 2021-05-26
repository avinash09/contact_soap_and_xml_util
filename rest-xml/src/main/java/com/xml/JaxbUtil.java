package com.xml;

import java.io.File;
import java.io.Writer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class JaxbUtil<T> {

	private T t;

	private JAXBContext jaxbContext;

	public JaxbUtil(T t) {
		this.t = t;
		try {
			// Create JAXB Context
			jaxbContext = JAXBContext.newInstance(t.getClass());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void objectToXmlWriter(Writer writer) {
		try {

			// Create Marshaller
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			// Required formatting??
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

			// Write XML to StringWriter
			jaxbMarshaller.marshal(t, writer);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	public T xmlToObject(File file) {

		Unmarshaller jaxbUnmarshaller = null;
		try {
			jaxbUnmarshaller = jaxbContext.createUnmarshaller();

			this.t = (T) jaxbUnmarshaller.unmarshal(file);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return this.t;
	}

}
