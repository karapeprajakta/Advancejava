package com.demo.dao;

import java.util.List;

import com.demo.model.Product;

public interface Productdao {

	List<Product> findall();

	int save(Product p);

	Product getbyid(int pid);

	int removebyid(int id);

	int updateById(int id, int qty, double pr);

}
