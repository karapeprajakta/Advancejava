package com.demo.service;

import java.util.List;

import com.demo.model.Test;

public interface TestService {

	List<Test> findall();

	void addnewemp(Test t);

	void updateemp(Test t);

	Test getbyid(int empid);

	Test deletebyid(int id);

	

}
