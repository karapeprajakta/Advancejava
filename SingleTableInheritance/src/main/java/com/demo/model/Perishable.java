package com.demo.model;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Perishable")
public class Perishable extends Product{
  
	private Date expdate;
	public Perishable() {
		super();
	}
	
	public Perishable(int id, String pname, Date mfDate, Date expdate) {
		super(id, pname, mfDate);
		
		this.expdate = expdate;
	}


	public Date getExpdate() {
		return expdate;
	}
	public void setExpdate(Date expdate) {
		this.expdate = expdate;
	}
	@Override
	public String toString() {
		return "Perishable [ expdate=" + expdate + "]";
	}
	
 
}
