package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Product;

public class TestProduct {

	public static void main(String[] args) {
		Product p=new Product(1,"maggie",10);
		Product p1=new Product(2,"biscuit",25);
		Product p2=new Product(3,"kurkure",100);
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		session.save(p);
		session.save(p1);
		session.save(p2);
		Product pro=session.get(Product.class,1);
		System.out.println(pro);
		tr.commit();
		session.close();
		
	}

}
