package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Product;

public class Testproduct {

	public static void main(String[] args) {
		SessionFactory fc = new Configuration().configure().buildSessionFactory();
		Session session=fc.openSession();
		Transaction tr=session.beginTransaction();
		Product p1=new Product(1,"maggie",10,50);
		Product p2=new Product(2,"biscuit",15,5);
		Product p3=new Product(3,"cookie",11,40);
		Product p4=new Product(4,"cake",12,12);
		session.save(p1);
		session.save(p2);
		session.save(p3);
		session.save(p4);
		tr.commit();
		session.close();
	}

}
