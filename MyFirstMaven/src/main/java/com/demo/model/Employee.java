package com.demo.model;

public class Employee {
	private int id;
	private String ename;
	private double sal;
	public Employee() {
		super();
	}
	public Employee( int id,String ename, double sal) {
		super();
		this.id = id;
		this.ename = ename;
		this.sal = sal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", sal=" + sal + "]";
	}
	

}
