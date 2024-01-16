package com.demo.test;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
	    Transaction tr =session.beginTransaction();
	    Employee e=new Employee(1,"raj",456);
	    Employee e1=new Employee(2,"Prajakta",45223);
	    Employee e2=new Employee(3,"saorabh",243324);
	    session.save(e);
	    session.save(e1);
	    session.save(e2);
	   Employee emp= session.get(Employee.class,1);
	   System.out.println(emp);
	    tr.commit();
	    session.close();

	}

}
