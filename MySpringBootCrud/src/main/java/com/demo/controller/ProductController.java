package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Product;
import com.demo.service.ProducrService;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProducrService pservice;
	@GetMapping("/")
	public ModelAndView getallproducts()
	{
		List<Product> plist=pservice.getallproducts();
		return new ModelAndView("displayproduct");
		
	}
	

}
