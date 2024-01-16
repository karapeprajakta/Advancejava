package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Employee;
import com.demo.model.Project;

public class Retrivedata {

	public static void main(String[] args) {
		SessionFactory sf =new Configuration().configure().buildSessionFactory();
		Session sess=sf.getCurrentSession();
		Transaction tr=sess.beginTransaction();
//		Employee e=sess.get(Employee.class, 2);
//		System.out.println(e.getEname());
//		System.out.println(e.getPset());
//		System.out.print(e);
		Project p=sess.get(Project.class, 10);
		System.out.print(p.getEset());
		tr.commit();
		sess.close();

	}

}
