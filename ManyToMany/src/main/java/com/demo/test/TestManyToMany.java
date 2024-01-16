package com.demo.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Employee;
import com.demo.model.Project;

public class TestManyToMany {

	public static void main(String[] args) {
		SessionFactory sf =new Configuration().configure().buildSessionFactory();
		Session sess=sf.getCurrentSession();
		Transaction tr=sess.beginTransaction();
		
		Employee e=new Employee(1,"Prajwal");
		Employee e1= new Employee(2,"Prajakata");
		Employee e3=new Employee(3,"chetan");
		Employee e4=new Employee(4,"Saourabh");
		Set<Employee> eset=new HashSet<Employee>();
		eset.add(e1);
		eset.add(e);
		Set<Employee> eset1=new HashSet<Employee>();
		eset1.add(e3);
		eset1.add(e4);
		Project p=new Project(10,"Banking");
		Project p2=new Project(11,"Service");
		Project p3=new Project(12,"Cloud");
		Set<Project> pset=new HashSet<Project>();
		Set<Project> pset1=new HashSet<Project>();
	
		pset.add(p);
		pset1.add(p3);
		pset1.add(p2);
		
		e1.setPset(pset1);
		e.setPset(pset);
		e3.setPset(pset1);
		e4.setPset(pset);

		p.setEset(eset);
		p2.setEset(eset1);
		p3.setEset(eset1);
		sess.save(e);
		sess.save(e1);
		sess.save(e3);
		sess.save(e4);sess.save(e1);
		sess.save(p);
		sess.save(p2);
		sess.save(p3);
		
		tr.commit();
		sess.close();		

	}

}
