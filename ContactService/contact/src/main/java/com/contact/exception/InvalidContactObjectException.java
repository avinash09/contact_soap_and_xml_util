package com.contact.exception;

import java.io.InvalidObjectException;

public class InvalidContactObjectException extends InvalidObjectException {

	private static final long serialVersionUID = 123l;

	private String code;

	public InvalidContactObjectException(String msg, String code) {
		super(msg);
		this.code = code;
	}

	public String getCode() {
		return this.code;
	}

}
