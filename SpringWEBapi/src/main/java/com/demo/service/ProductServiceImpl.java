package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.ProductDao;
import com.demo.model.Product;

@Service
public class ProductServiceImpl implements ProductService{
  @Autowired
  private ProductDao pdao;

@Override
public List<Product> getallproducts() {
	// TODO Auto-generated method stub
	return pdao.getall();
}

@Override
public void addnewprod(Product p) {
     pdao.save(p);
	
}

@Override
public Product getbyid(int pid) {
	// TODO Auto-generated method stub
	return pdao.findbyid(pid);
}



@Override
public void updatebyid(Product product) {
	pdao.update(product);
	
}

@Override
public void deletebyid(int pid) {
	pdao.removebyid(pid);
	
}
  
	
}
