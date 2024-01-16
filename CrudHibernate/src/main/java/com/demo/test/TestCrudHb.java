package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.model.Myuser;
import com.demo.service.UserservIMpl;
import com.demo.service.Userservice;

public class TestCrudHb {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Userservice user=new UserservIMpl();
		int choice;
		do {
			System.out.println("1:add new user\n2:Display all\n3:display by id \n 4:delete by id \n5:sortby id\n6:updatebyid");
			System.out.println("Choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
			      user.addnewuser();
				break;
			case 2 :
				List<Myuser> elist=user.getalluser();
				elist.forEach(System.out::println);
				break;
			case 3:
				System.out.println("enter id");
				int id=sc.nextInt();
				Myuser u=user.getbyid(id);
				if(u!=null)
				{
					System.out.println(u);
				}
				else {
					System.out.println("not found");
				}
				break;
			case 4:
				System.out.println("enter id");
				 id=sc.nextInt();
				 boolean status=user.deletebyid(id);
				 if(status)
				 {
					 System.out.println("deleted successfully");
				 }
				 else
				 {
					 System.out.println("not found");
				 }
				
				break;
			case 5:
				 elist=user.sortbyid();
				elist.forEach(System.out::println);
				break;
			case 6:
				System.out.println("enter id");
				 id=sc.nextInt();
				
				System.out.println("Enter user city");
					String c=sc.next();
					System.out.println("Enter user state");
					String s=sc.next();
					status=user.updatebyid(id,c,s);
					if(status)
					{
						System.out.println("update successfully");
					}
					else {
						System.out.println("id not found");
					}
				break;
			
			
				
			}
			
		}
		while(choice!=0);

	}

}
