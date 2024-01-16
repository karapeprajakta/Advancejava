package com.demo.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.xdevapi.ColumnDefinition.StaticColumnDefinition;

public class HibernateUtil {

	
		static SessionFactory sf;
		static SessionFactory getMySessionFactory() {
			if(sf==null) {
				sf=new Configuration().configure().buildSessionFactory();
			}
			return sf;
		}
		static void closeMySessionFactory()
		{
			if(sf!=null)
			{
				sf.close();
			}
		}

}
