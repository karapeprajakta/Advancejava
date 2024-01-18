package com.demo.service;

import java.util.List;

import com.demo.model.Product;

public interface ProductService {

	List<Product> getallproducts();

	void addnewprod(Product p);

	Product getbyid(int pid);

	void updatebyid(Product product);

	void deletebyid(int pid);



}
