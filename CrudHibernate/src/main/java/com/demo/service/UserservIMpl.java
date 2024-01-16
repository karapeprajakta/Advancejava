package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.dao.UserDao;
import com.demo.dao.UserDaoImpl;
import com.demo.model.Address;
import com.demo.model.Myuser;

public class UserservIMpl implements Userservice {
     static  UserDao udao;
     public UserservIMpl()
     {
    	 udao=new UserDaoImpl();
     }
	public void addnewuser() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Uid");
		int id=sc.nextInt();
		System.out.println("Enter user name");
		String nm=sc.next();
		System.out.println("Enter a aid");
		int aid=sc.nextInt();
		System.out.println("Enter user city");
		String c=sc.next();
		System.out.println("Enter user state");
		String s=sc.next();
		Myuser e=new Myuser(id,nm,new Address(aid,c,s));
		udao.save(e);
		
	}
	@Override
	public List<Myuser> getalluser() {
		
		return udao.getall();
	}
	@Override
	public Myuser getbyid(int id) {
		
		return udao.findbyid(id);
	}
	@Override
	public boolean deletebyid(int id) {
		
		return udao.removebyid(id);
	}
	@Override
	public List<Myuser> sortbyid() {
		
		return udao.sortid();
	}
	@Override
	public boolean updatebyid(int id, String c, String s) {
		
		return udao.editbyid(id,c,s);
	}

}
