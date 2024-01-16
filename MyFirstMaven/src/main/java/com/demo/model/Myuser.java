package com.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Usertab")
public class Myuser {
	@Id
	@Column(name="UserId")
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private int id;
	
	private String uname;
	@Column(name="Pass",nullable=false,unique=true)
	private String password;
	public Myuser() {
		super();
	}
	public Myuser(String uname, String password) {
		super();
		this.uname = uname;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Myuser [id=" + id + ", uname=" + uname + ", password=" + password + "]";
	}
	
 }
