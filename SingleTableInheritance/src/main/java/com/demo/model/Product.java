package com.demo.model;

import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
@Entity
@Table(name="inheritance")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type",discriminatorType = DiscriminatorType.STRING)
public class Product {
	@Id
    private int id;
    private String pname;
    private Date mfdate;
	public Product() {
		super();
	}
	public Product(int id, String pname, Date mfdate) {
		super();
		this.id = id;
		this.pname = pname;
		this.mfdate = mfdate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Date getMfdate() {
		return mfdate;
	}
	public void setMfdate(Date mfdate) {
		this.mfdate = mfdate;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", pname=" + pname + ", mfdate=" + mfdate + "]";
	}
    
    
	
}
