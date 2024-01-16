package com.demo.dao;

import java.util.List;

import com.demo.model.Myuser;

public interface UserDao {

	void save(Myuser e);

	List<Myuser> getall();

	Myuser findbyid(int id);

	boolean removebyid(int id);

	List<Myuser> sortid();

	boolean editbyid(int id, String c, String s);

}
