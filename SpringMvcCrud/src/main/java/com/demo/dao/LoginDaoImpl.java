package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.model.MyUser;

@Repository
public class LoginDaoImpl implements LoginDao {
	@Autowired
   private JdbcTemplate jdbcTemplate;
	@Override
	public MyUser checkuser(String unm, String passwd) {
		try {
		return jdbcTemplate.queryForObject("select * from myuser where username=? and password=?",new Object[] {unm,passwd},BeanPropertyRowMapper.newInstance(MyUser.class));
		
		}
		catch(EmptyResultDataAccessException e)
		{
			e.fillInStackTrace();
		}
		return null;
				
	}
	

}
