package com.demo.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
private int addid;
private String city;
private String streat;
public Address() {
	super();
}
public Address(int addid, String city, String streat) {
	super();
	this.addid = addid;
	this.city = city;
	this.streat = streat;
}
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
public String getStreat() {
	return streat;
}
public void setStreat(String streat) {
	this.streat = streat;
}
@Override
public String toString() {
	return "Address [addid=" + addid + ", city=" + city + ", streat=" + streat + "]";
}

}
