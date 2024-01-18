package com.demo.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.NonPerishableProduct;
import com.demo.model.Perishable;

public class TestSingleTable {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Perishable p1=new Perishable(12,"Biscuits", new Date(), new Date());
		NonPerishableProduct p2=new NonPerishableProduct(13,"Chair",new Date(),"Furniture");
		session.save(p2);
		session.save(p1);
		tr.commit();

	}

}
