package com.demo.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("1")
	private int id;
	@Value("prajwal")
	private String name;
	@Value("3000.00")
	private double sal;
	public Employee() {
		
		super();
		System.out.println("default");
	}
	public Employee(int id, String name, double sal) {

		super();
		System.out.println("Parameter");
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("setter");
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
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	

}
