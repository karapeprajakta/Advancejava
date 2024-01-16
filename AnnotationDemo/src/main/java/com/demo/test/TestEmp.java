package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.model.Employee;
import com.demo.service.Empservice;

public class TestEmp {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("springconfig.xml");
		Employee e1=(Employee) ctx.getBean("employee");
		System.out.println(e1);
		 Empservice  eservice=(Empservice) ctx.getBean("emplServiceImpl");
		 
		
	}

}
