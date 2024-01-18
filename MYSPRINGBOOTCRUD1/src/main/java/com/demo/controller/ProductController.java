package com.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Product;
import com.demo.service.ProducrService;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProducrService pservice;
	@GetMapping("/products")
	public ModelAndView getallproducts()
	{
		List<Product> plist=pservice.getallproducts();
		   return new ModelAndView("displayproduct","plist",plist);
		
	}
	@GetMapping("/add")
	public String addproduct(HttpSession session)
	{
		return "addproduct";
	}
	 @PostMapping("/insertproduct")
	public ModelAndView insertproduct(@RequestParam int pid,@RequestParam String pname,@RequestParam int qty,@RequestParam double price )
	{
		Product p=new Product(pid,pname,qty,price);
		 pservice.addnewproduct(p);
		 return new ModelAndView("redirect:/product/products");
	}
    @GetMapping("/editproduct/{pid}")
    public ModelAndView editproduct(@PathVariable int pid)
    {   Product p=pservice.getById(pid);
    	return new ModelAndView("editproduct","p",p);
    }
    @PostMapping("/updateproduct")
   	public ModelAndView updateproduct(@RequestParam int pid,@RequestParam String pname,@RequestParam int qty,@RequestParam double price )
   	{
   		Product p=new Product(pid,pname,qty,price);
   		 pservice.updatebyid(p);
   		 return new ModelAndView("redirect:/product/products");
   	}
    @GetMapping("/deleteproduct/{pid}")
    public ModelAndView deleteproduct(@PathVariable int pid)
    {   pservice.deleteById(pid);
    	return new ModelAndView("redirect:/product/products");
    }
}
