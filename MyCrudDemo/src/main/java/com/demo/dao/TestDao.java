package com.demo.dao;

import java.util.List;

import com.demo.model.Test;

public interface TestDao {

	List<Test> getAll();

	void add(Test t);

	void update(Test t);

	Test findbyid(int empid);

	Test removebyid(int id);

}
