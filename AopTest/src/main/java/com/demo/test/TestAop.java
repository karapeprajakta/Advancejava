package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.model.MyGame;

public class TestAop {
	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("springconfig.xml");
		MyGame mg=(MyGame) ctx.getBean("myGame");
		mg.m1();
		mg.m2();
	}

}
