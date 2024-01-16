package com.demo.service;

import java.util.List;

import com.demo.model.Myuser;

public interface Userservice {

	void addnewuser();

	List<Myuser> getalluser();

	Myuser getbyid(int id);

	boolean deletebyid(int id);

	List<Myuser> sortbyid();

	boolean updatebyid(int id, String c, String s);

}
