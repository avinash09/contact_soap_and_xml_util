package com.student.service;

import com.student.artifacts.Class;

public interface StudentService {

	public boolean validate();
	
	public String objectToXml();
	
	public Class xmlToObject();
	
}
