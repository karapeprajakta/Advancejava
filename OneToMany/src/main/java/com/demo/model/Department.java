package com.demo.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Depttab12")
public class Department {
   @Id
	private int dno;
	private String dname;
	@OneToMany(mappedBy = "dept",cascade=CascadeType.ALL)
	private Set<Employee> eset;
	public Department(int dno, String dname, Set<Employee> eset) {
		super();
		this.dno = dno;
		this.dname = dname;
		this.eset = eset;
	}
	public Department() {
		super();
	}
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public Set<Employee> getEset() {
		return eset;
	}
	public void setEset(Set<Employee> eset) {
		this.eset = eset;
	}
	@Override
	public String toString() {
		return "Department [dno=" + dno + ", dname=" + dname + "]";
	}
	
	
	
	
	
}
