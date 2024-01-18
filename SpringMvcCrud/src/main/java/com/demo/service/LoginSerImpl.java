package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.LoginDao;
import com.demo.model.MyUser;

@Service
public class LoginSerImpl implements LoginService {

	@Autowired
	public LoginDao dao;

	@Override
	public MyUser validateUser(String unm, String passwd) {
		
		return dao.checkuser(unm,passwd);
	}
}
