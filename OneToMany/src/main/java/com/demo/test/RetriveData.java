package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Department;
import com.demo.model.Employee;

public class RetriveData {

	public static void main(String[] args) {
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		Session session=sf.getCurrentSession();
		Transaction tr= session.beginTransaction();
		Department d= session.get(Department.class, 1);
		System.out.println(d.getEset());
		Employee e=session.get(Employee.class, 2);
		System.out.println(e.getDept());
		
		tr.commit();
		

	}

}
