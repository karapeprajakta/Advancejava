package com.demo.service;

import java.util.List;

import com.demo.model.Product;

public interface ProducrService {

	List<Product> getallproducts();

	void addnewproduct(Product p);

	Product getById(int pid);

	void updatebyid(Product p);

     void deleteById(int pid);




}
