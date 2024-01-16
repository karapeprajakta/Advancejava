package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Myuser;

public class TestUser {
	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session seccion= sf.openSession();
		Transaction tr= seccion.beginTransaction();
		
//		Myuser m=new Myuser("prajwal","praj2132");
//		
//          seccion.save(m);
          Myuser m2=seccion.get(Myuser.class, 1);
		System.out.print(m2);
      
		
		
//		m2.setUname("prajwal12345");
	
		seccion.delete(m2);
//		System.out.println("before update");
//		System.out.println(m);
		tr.commit();
		seccion.close();
//		Session session=sf.openSession();
//		Transaction tr1=session.beginTransaction();
//		Myuser m1=session.get(Myuser.class,1);
//		session.merge(m);
//		tr1.commit();
//		session.close();
//		sf.close();
//		
		
		
		
	}

}
