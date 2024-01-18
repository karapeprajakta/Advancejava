package com.demo.service;

import java.util.List;

import com.demo.model.Product;

public interface ProductService {

	List<Product> getallproduct();

	Product getbyid(int pid);

	void addproduct(Product p1);

	void deletebyid(int pid);

	void updatebyid(Product p);

}
