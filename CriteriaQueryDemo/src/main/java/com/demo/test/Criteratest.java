package com.demo.test;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import com.demo.model.Product;

public class Criteratest {
	public static void main(String[] args) {
		SessionFactory fc = new Configuration().configure().buildSessionFactory();
		Session session=fc.openSession();
		Transaction tr=session.beginTransaction();
		Criteria cr=session.createCriteria(Product.class);
	
//	     cr.add(Restrictions.gt("qty",11));
//		 List e=cr.list();
	//	e.forEach(System.out::println);
		//retrieve all products
		//String str="select p from Product p"
		List elist=cr.list();
		elist.forEach(System.out::println);
		
		//find products with price >300 and qty<50
		Criterion pricegt=Restrictions.gt("price", 5.0);
		Criterion qtylt=Restrictions.lt("qty", 15);
		Criteria cr1=session.createCriteria(Product.class);
		LogicalExpression expr=Restrictions.and(pricegt, qtylt);
		cr1.add(expr);
		elist=cr1.list();
		elist.forEach(System.out::println);
		
		//to find only first 2 records
		cr.setFirstResult(1);
		cr.setMaxResults(3);
		elist=cr.list();
		elist.forEach(System.out::println);
		System.out.println("********************************");
		//using JPQL
		System.out.println("using JPQL");
		CriteriaBuilder cb=session.getCriteriaBuilder();
		CriteriaQuery<Product> cr2=cb.createQuery(Product.class);
		Root<Product> rt=cr2.from(Product.class);
		Query q=session.createQuery(cr2.select(rt));
		elist=q.getResultList();
		elist.forEach(System.out::println);
		System.out.println("********************************");
		
		
	}

}
