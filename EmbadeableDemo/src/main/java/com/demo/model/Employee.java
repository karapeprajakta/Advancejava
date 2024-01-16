package com.demo.model;

import javax.persistence.*;



@Entity
@Table(name="Emptab11")
public class Employee {
	@Id
	private int id;
	private String Ename; 
	@Embedded
	private Address dpt;
	public Employee() {
		super();
	}
	public Employee(int id, String ename, Address dpt) {
		super();
		this.id = id;
		Ename = ename;
		this.dpt = dpt;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public Address getDpt() {
		return dpt;
	}
	public void setDpt(Address dpt) {
		this.dpt = dpt;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", Ename=" + Ename + ", dpt=" + dpt + "]";
	}
	
}
