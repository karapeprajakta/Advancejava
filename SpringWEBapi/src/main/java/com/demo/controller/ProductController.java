package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService pdao;
	
	@GetMapping("/products")
	public ResponseEntity<List<Product>> getAllProduct()
	{
		return ResponseEntity.ok(pdao.getallproducts());
	}
	@GetMapping("/products/{pid}")
	public ResponseEntity<Product> getallproducts(@PathVariable int pid)
	{Product p=pdao.getbyid(pid);
	System.out.println(p);
	 if(p!=null) {
		return ResponseEntity.ok(p);
	}
	 else {
		 return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	 }
	 }
	
	@PostMapping("/products/{pid}")
	public ResponseEntity<String> addnewproduct(@RequestBody Product p)
	{
	    pdao.addnewprod(p);
	    		return ResponseEntity.ok("Data Added Successfully!!!!!! ");
	}
	@DeleteMapping("/products/{pid}")
	public ResponseEntity<String> deleteproduct(@PathVariable int pid)
	{
	    pdao.deletebyid(pid);
	    		return ResponseEntity.ok("Data delete Successfully!!!!!! ");
	}
	@PutMapping("/products/{pid}")
	public  ResponseEntity<String> updateproduct(@RequestBody Product p)
	
	{
		pdao.updatebyid(p);
		return ResponseEntity.ok("Data updated Successfully");
		
	}
	
}
