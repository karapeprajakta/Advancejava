package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Student;

public class TestStudent {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
//		Student s=new Student("RAj",67);
//		session.save(s);
//		System.out.println(s);
	   //s.setSname("Rajan");
//	   session.saveOrUpdate(s);
//	   System.out.println("After updation");
//	   System.out.println(s);
		Student s1=session.get(Student.class,7);
		   
	    System.out.println(s1);
	    tr.commit();
	    session.close();
	 
	    Session session1 =sf.openSession();
	    Transaction tr1=session1.beginTransaction();
	    Student stu=session1.load(Student.class,7);
	    s1.setMarks(100);
	    session1.merge(s1);
	    
	    System.out.println("after update");
	    System.out.println(stu);
	    tr1.commit();
	    session1.close();
	    
	    
		
 
	}

}
