package com.demo.model;

import org.springframework.stereotype.Component;

@Component
public class MyGame {

	public void m1()
	{
		System.out.println("In method m1");
	}
	public void m2()
	{
		System.out.println("In method m2");
	}
	public void m3(int x)
	{
		System.out.println("In method m3"+x);
	}
}
