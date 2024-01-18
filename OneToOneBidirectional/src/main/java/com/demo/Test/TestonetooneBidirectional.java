package com.demo.Test;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Address;
import com.demo.model.MyUser;

public class TestonetooneBidirectional {
	public static void main(String[] args) {	
	Address d=new Address(1,"pune","mh");
	Address d1=new Address(2,"Mumbai","mh");
    MyUser  m=new MyUser(1,"prajwal",d);
    MyUser  m1=new MyUser(2,"Prajakta",d1);
    SessionFactory sf= new Configuration().configure().buildSessionFactory();
	Session se1=sf.getCurrentSession();
	Transaction tr= se1.beginTransaction();
    m.setAddr(d);
    m1.setAddr(d1);
    d.setU(m);
    d.setU(m1);
    se1.save(d);
    se1.save(d1);
    se1.save(m);
    se1.save(m1);
    tr.commit();
}
}
