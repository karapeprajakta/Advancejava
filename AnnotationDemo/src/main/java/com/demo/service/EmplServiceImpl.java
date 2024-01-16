package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.EmpDao;

@Service
public class EmplServiceImpl implements Empservice{

	@Autowired
	 private EmpDao edao;
}
