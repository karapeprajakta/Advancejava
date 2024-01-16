package com.demo.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	private int addid;
	private  String city;
	public int getAddid() {
		return addid;
	}
	public void setAddid(int addid) {
		this.addid = addid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address() {
		super();
	}
	public Address(int addid, String city) {
		super();
		this.addid = addid;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [addid=" + addid + ", city=" + city + "]";
	}
	


}
