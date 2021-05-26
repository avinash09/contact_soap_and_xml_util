package com.student.service;

import java.io.File;
import java.io.StringWriter;
import java.math.BigInteger;
import java.net.URL;
import java.util.List;

import javax.xml.transform.stream.StreamSource;

import com.student.artifacts.Class;
import com.student.artifacts.StudentType;
import com.xml.JaxbUtil;
import com.xml.XmlValidator;

public class StudentServiceImpl implements StudentService {

	public boolean validate() {
		boolean isXmlValide = false;
		try {
			URL fileUrl = this.getClass().getResource("/com/student/xml/students.xml");
			File file = new File(fileUrl.getFile());

			URL xsdurl = this.getClass().getResource("/com/student/xsd/students.xsd");

			isXmlValide = new XmlValidator(xsdurl.getPath(), new StreamSource(file)).validate();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return isXmlValide;
	}

	public String objectToXml() {
		Class cls = new Class();
		List<StudentType> stdList = cls.getStudent();
		StringWriter str = new StringWriter();
		String xmlStr = null;

		try {
			StudentType std = new StudentType();
			std.setRollno(new BigInteger("101"));
			std.setFirstname("Avinash");
			std.setLastname("Lonkar");
			std.setNickname("Avi");
			std.setMarks(new BigInteger("85"));
			
			stdList.add(std);

			new JaxbUtil<Class>(cls).objectToXmlWriter(str);

			xmlStr = str.toString();
			System.out.println(xmlStr);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return xmlStr;
	}

	public Class xmlToObject() {
		Class cls = new Class();

		URL xmlUrl = this.getClass().getResource("/com/student/xml/students.xml");
		File xmlFile = new File(xmlUrl.getPath());

		cls = new JaxbUtil<Class>(cls).xmlToObject(xmlFile);
		return cls;
	}

}
