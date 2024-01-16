package com.demo.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Department;
import com.demo.model.Employee;

public class TestOnetoMany {

	public static void main(String[] args) {
		Employee e1= new Employee(1,"prajwal",1002300);
		Employee e2= new Employee(2,"praj",1020200);
		Employee e3= new Employee(3,"raj",102000);
		Employee e4= new Employee(4,"prajwal123",120000);
		Set<Employee> eset1=new HashSet<Employee>();
		eset1.add(e1);
		eset1.add(e2);
		Set<Employee> eset2=new HashSet<Employee>();
		eset2.add(e3);
		eset2.add(e4);
		
		Department d=new Department(1,"hr",eset1);
		
		Department d1=new Department(2,"Manager",eset2);
		e1.setDept(d);
		e2.setDept(d);
		e3.setDept(d1);
		e4.setDept(d1);
		
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		Session session=sf.getCurrentSession();
		Transaction tr= session.beginTransaction();
		session.save(e1);
		session.save(e2);
		session.save(e3);
		session.save(e4);
		session.save(d);
		session.save(d1);
		tr.commit();
		

	}

}
