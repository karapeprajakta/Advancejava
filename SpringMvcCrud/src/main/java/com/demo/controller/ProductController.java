package com.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.MyUser;
import com.demo.model.Product;
import com.demo.service.ProducrService;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
        private ProducrService pservice;
	
	@GetMapping("/getproducts")
	public ModelAndView getproducts(HttpSession session)
	{
		MyUser u=(MyUser) session.getAttribute("user");
		if(u!=null)
		{
			System.out.println(u);
			List<Product> plist=pservice.getallproducts();
			return new ModelAndView("displayproduct","plist",plist);
		}
		
		return new ModelAndView("redirect:/login/");
		
	}
	@GetMapping("/addnewproduct")
	public String displayaddform(HttpSession session)
	
	{
		MyUser u=(MyUser) session.getAttribute("user");
		if(u!=null)
		{
			return "addproduct";
			
		}
		return ("redirect:/login/");
	}

	
	
	@PostMapping("/insertproduct")
	public ModelAndView insertproduct(@RequestParam int pid,@RequestParam String pname,@RequestParam int qty,@RequestParam double price) {
		
		Product p=new Product(pid,pname,qty,price);
		pservice.addnewprod(p);
		return new ModelAndView("redirect:/product/getproducts");
		
	}
	
	@GetMapping("/editproduct/{pid}")
	public ModelAndView editproduct(@PathVariable("pid") int pid)
	{  System.out.println(pid);
		Product p=pservice.getbyid(pid);
		return new ModelAndView("editproduct","p",p);
	}
	@PostMapping("/updateproduct")
	public ModelAndView updateproduct(@RequestParam int pid,@RequestParam String pname, @RequestParam int qty,@RequestParam double price)
	{   
		System.out.println("fsdf"+pid);
		pservice.updatebyid(new Product(pid,pname,qty,price));
		return new ModelAndView ("redirect:/product/getproducts");
	}
	@GetMapping("/deleteproduct/{pid}")
	public ModelAndView deleteproduct(@PathVariable("pid") int pid)
	{
		pservice.deletebyid(pid);
		return new ModelAndView("redirect:/product/getproducts");
	}
}
