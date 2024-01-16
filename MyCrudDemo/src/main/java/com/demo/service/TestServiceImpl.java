package com.demo.service;

import java.util.List;

import com.demo.dao.TestDao;
import com.demo.dao.TestDaoImpl;
import com.demo.model.Test;

public class TestServiceImpl implements TestService{

	private static TestDao edao;
	public TestServiceImpl()
	{super();
		edao=new TestDaoImpl();
	}
	
	@Override
	public List<Test> findall() {
		
		return edao.getAll();
	}

	@Override
	public void addnewemp(Test t) {
		 edao.add(t);
		
	}

	@Override
	public void updateemp(Test t) {
		edao.update(t);
		
	}

	@Override
	public Test getbyid(int empid) {
		
		return edao.findbyid(empid);
	}

	@Override
	public Test deletebyid(int id) {
		
		return edao.removebyid(id);
	}

}
