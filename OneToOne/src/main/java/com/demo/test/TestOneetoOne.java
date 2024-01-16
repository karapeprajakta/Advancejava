package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Address;
import com.demo.model.MyUser;

public class TestOneetoOne {

	public static void main(String[] args) {
		Address ad1=new Address(1,"pune","mh");
		Address ad2=new Address(2,"Chakan","mh");
		MyUser u1=new MyUser(10,"prajwal",ad2);
		MyUser u2=new MyUser(11,"prajakta",ad1);
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session =sf.getCurrentSession();
		Transaction tr=session.beginTransaction();
		session.save(ad1);
		session.save(ad2);
		session.save(u1);
		session.save(u2);
		System.out.println("after");
		System.out.println("load method");
		MyUser emp=session.load(MyUser.class, 11);
		System.out.println(emp.getId());
		System.out.println("get method");
	System.out.println(session.get(MyUser.class,10));
		
		System.out.println("before");
		
		
		tr.commit();
		
		
		
	}

}
