package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.ProductDao;
import com.demo.model.Product;

@Service
public class ProductServiceImpl implements ProducrService{
  @Autowired
  private ProductDao pdao;

@Override
public List<Product> getallproducts() {
	// TODO Auto-generated method stub
	return pdao.findAll();
}

@Override
public void addnewproduct(Product p) {
	pdao.save(p);
	
}

@Override
public Product getById(int pid) {
	 Optional<Product> op=pdao.findById(pid);
	 if(op.isPresent()) {
		 return op.get();
	 }
	 return null;
}

@Override
public void updatebyid(Product p) {
	Optional<Product> p1=pdao.findById(p.getPid());
	if(p1.isPresent())
	{
		Product p2=p1.get();
		p2.setPname(p.getPname());
		p2.setQty(p.getQty());
		p2.setPrice(p.getPrice());
		pdao.save(p2);
	}
	
}

@Override
public void deleteById(int pid) {
	
	 pdao.deleteById(pid);;

}

	
}
