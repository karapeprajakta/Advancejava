package com.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.demo.model.Myuser;

public class UserDaoImpl implements UserDao{
	static SessionFactory sf;
	static {
		sf=HibernateUtil.getMySessionFactory();
	}
	public void save(Myuser e) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		session.save(e);
		tr.commit();
		session.close();


	}
	@Override
	public List<Myuser> getall() {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Query query=session.createQuery("from Myuser");
		List<Myuser> ulist=query.list();
		tr.commit();
		session.close();
		return ulist;
	}
	@Override
	public Myuser findbyid(int id) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Myuser u=session.get(Myuser.class, id);
		tr.commit();
		session.close();
		return u;
	}
	@Override
	public boolean removebyid(int id) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Myuser u=session.get(Myuser.class,id);
		if(u!=null)
		{
			session.delete(u);
			tr.commit();
			session.close();
			return true;
		}
		session.close();
		return false;
	}
	@Override
	public List<Myuser> sortid() {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Query query=session.createQuery("from Myuser u order by u.uid");
		List<Myuser> ulist=query.list();
		tr.commit();
		session.close();
		return ulist;
	}
	@Override
	public boolean editbyid(int id, String c, String s) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Myuser u=session.get(Myuser.class,id);
		if(u!=null)
		{u.getAdr().setCity(c);
		u.getAdr().setStreat(s);
		session.update(u);
		tr.commit();
		session.close();
		return true;
		}
		session.close();
		return false;
	}

}
