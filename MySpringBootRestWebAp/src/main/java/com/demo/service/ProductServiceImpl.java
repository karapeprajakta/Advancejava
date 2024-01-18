package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.ProductDao;
import com.demo.model.Product;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
	ProductDao pdao;

	@Override
	public List<Product> getallproduct() {
		
		return pdao.findAll();
	}

	@Override
	public Product getbyid(int pid) {
	Optional<Product> p=pdao.findById(pid);
	if(p!=null)
	   return p.get();
		return null;
	}

	@Override
	public void addproduct(Product p1) {
		 pdao.save(p1);		
	}

	@Override
	public void deletebyid(int pid) {
		pdao.deleteById(pid);
		
	}

	@Override
	public void updatebyid(Product p) {
		Optional<Product> op=pdao.findById(p.getPid());
		
		if(op.isPresent())
		{
				Product p2=op.get();
		        p2.setPname(p.getPname()); 
		        p2.setQty(p.getQty());
		        p2.setPrice(p.getPrice());
		        pdao.save(p2);
		}
	}
	

}
