package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="add13")
public class Address {
	
	@Id
	private int aid;
	private String city;
	private String state;
	@OneToOne(mappedBy="addr")
	private MyUser u;
	public Address() {
		super();
	}
	public Address(int aid, String city, String state) {
		super();
		this.aid = aid;
		this.city = city;
		this.state = state;
		
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public MyUser getU() {
		return u;
	}
	public void setU(MyUser u) {
		this.u = u;
	}
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", city=" + city + ", state=" + state + ", u=" + u + "]";
	}
   
 
}
