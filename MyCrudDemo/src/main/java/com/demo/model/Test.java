package com.demo.model;

public class Test {
	private int id;
	private String name;
	private double sal;
	public Test() {
		super();
	}
	public Test(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
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
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Test [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	

}
