package com.xml;

import java.io.File;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.SAXException;

public class XmlValidator implements XmlValidatorInterface {

	private String xsdPath;

	private StreamSource streamSource;

	private SchemaFactory factory;

	private Schema schema;

	private Validator validator;

	public XmlValidator(String xsdPath, StreamSource streamSource) throws SAXException {
		super();
		this.xsdPath = xsdPath;
		this.streamSource = streamSource;
		builSchemaFactory();
		buildSchema();
		buildValidator();
	}

	private void builSchemaFactory() {
		if (factory == null) {
			factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		}
	}

	private void buildSchema() throws SAXException {
		schema = factory.newSchema(new File(xsdPath));
	}

	private void buildValidator() {
		validator = schema.newValidator();
	}

	public boolean validate() {

		try {
			validator.validate(streamSource);
		} catch (IOException e) {
			System.out.println("Exception: " + e.getMessage());
			return false;
		} catch (SAXException e1) {
			System.out.println("SAX Exception: " + e1.getMessage());
			return false;
		}
		return true;
	}

}
