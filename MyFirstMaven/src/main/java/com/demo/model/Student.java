package com.demo.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="studenttab")
public class Student {
	@Id
	@Column(name="SId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	private String sname;
	@Column(name="Marks", nullable=false, unique=true)
	private double marks;
	public Student() {
		super();
	}
	public Student(String sname, double marks) {
		super();
		this.sname = sname;
		this.marks = marks;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", sname=" + sname + ", marks=" + marks + "]";
	}
	
	
	

}
