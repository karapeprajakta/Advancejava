package com.demo.Aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspectS {
	@Before("execution (* com.demo.model.*.*(..))")
	public void addpoint()
	{
		System.out.println("IN the AddPoint Function");
	}
	@After("execution (* com.demo.model.*.*(..))")
	public void deductpoint()
	{
		System.out.println("IN the Deductpoint Function");
	}

}
