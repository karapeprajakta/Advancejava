package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

@RestController

@RequestMapping("/products")
public class ProductController {

	@Autowired
	ProductService ps=new ProductServiceImpl();
	@GetMapping("/product")
	public ResponseEntity<List<Product>> getall()
	{
		List<Product> p=ps.getallproduct();
		if(p!=null)
			return ResponseEntity.ok(p);
		return null;
		
	}
	
	@GetMapping("/product/{pid}")
	public ResponseEntity<Product> getbyId(@PathVariable int pid)
	{
		Product p=ps.getbyid(pid);
		return ResponseEntity.ok(p);
	}
	@PostMapping("/product/{pid}")
	public ResponseEntity< String> insertproduct(@RequestBody Product p1){
		
		ps.addproduct(p1);
		return ResponseEntity.ok("Product Added Succefully");
		
		
	}
	@DeleteMapping("/product/{pid}")
	public ResponseEntity<String> removebyId(@PathVariable int pid)
	{
		ps.deletebyid(pid);
		return ResponseEntity.ok("Deleted Successfully");
	}
	@PutMapping("/product/{pid}")
	public ResponseEntity<String> updatebyid(@RequestBody Product p)
	{
		ps.updatebyid(p);
		return ResponseEntity.ok("update Successfully");
	}
	
}
