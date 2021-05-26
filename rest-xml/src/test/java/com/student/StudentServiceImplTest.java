package com.student;

import static org.junit.Assert.assertNotEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.student.service.StudentServiceImpl;

import junit.framework.TestCase;

public class StudentServiceImplTest extends TestCase {

	StudentServiceImpl studentServiceImpl;
	
	@BeforeClass
	public void setUp() {
		studentServiceImpl = new StudentServiceImpl();
	}
	
	@Test
	public void testvalidate() {
		assertTrue(studentServiceImpl.validate());
	}

	@Test
	public void testobjectToXml() {
		assertNotNull(studentServiceImpl.objectToXml());
	}
	
	@Test
	public void testxmlToObject() {
		assertNotEquals(studentServiceImpl.xmlToObject().getStudent().size(),0);
	}
	
	
}
