package com.demo.Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Address;
import com.demo.model.MyUser;

public class RetriveData {

	public static void main(String[] args) {
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		Session session=sf.getCurrentSession();
		Transaction tr= session.beginTransaction();
			
		MyUser m=session.get(MyUser.class, 2);
		System.out.println(m);
		tr.commit();		
	}

}
