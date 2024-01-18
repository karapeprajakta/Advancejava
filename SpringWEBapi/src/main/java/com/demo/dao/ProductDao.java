package com.demo.dao;

import java.util.List;

import com.demo.model.Product;

public interface ProductDao {

	List<Product> getall();

	void save(Product p);

	Product findbyid(int pid);

    

	void update(Product product);

	void removebyid(int pid);

}
