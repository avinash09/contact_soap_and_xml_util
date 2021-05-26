package com.contact.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Contact")
@XmlType(propOrder = { "id", "name", "pincode", "city", "state", "country", })
@XmlAccessorType(XmlAccessType.FIELD)
public class Contact extends ContactServiceStub {

	private int id;

	private String name;

	private String country;

	private String state;

	private String city;

	private int pincode;

	public Contact(int id, String name, String country, String state, String city, int pincode) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}

	public Contact() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", country=" + country + ", state=" + state + ", city=" + city
				+ ", pincode=" + pincode + "]";
	}
}
