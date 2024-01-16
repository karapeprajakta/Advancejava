package com.demo.Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Address;
import com.demo.model.Employee;

public class TestEmbaded {

	public static void main(String[] args) {
		Address ad1=new Address(1,"pune");
		Address ad2=new Address(2,"chakan");
		Employee emp= new Employee(10,"Prajwal",ad2);
		Employee emp2=new Employee(11,"prajakta",ad1);
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session =sf.getCurrentSession();
		Transaction tr=session.beginTransaction();
		session.save(emp);
		session.save(emp2);
		tr.commit();
		
		
		

	}

}
