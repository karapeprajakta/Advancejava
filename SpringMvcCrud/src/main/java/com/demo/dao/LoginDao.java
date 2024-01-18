package com.demo.dao;

import com.demo.model.MyUser;

public interface LoginDao {

	MyUser checkuser(String unm, String passwd);

}
