package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/login")
public class HelloController {
	@GetMapping("/hello")
	public ModelAndView sayhello() 
	{ System.out.println("sayhello called");
	String s="Hello World from controller!!";
	return new ModelAndView("hello","msg",s);
	}
    @GetMapping("/test1")
	public String Method1(Model model)
	{    
    	 model.addAttribute("msg", "welcome");
	     model.addAttribute("num1", 10);
	     model.addAttribute("num2", 20);
		return "test";
    	
	}

}
