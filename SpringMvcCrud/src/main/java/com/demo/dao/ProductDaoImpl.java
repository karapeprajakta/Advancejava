package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.model.Product;
@Repository
public class ProductDaoImpl implements ProductDao {
  @Autowired
  private JdbcTemplate jdbcTemplate;
	@Override
	public List<Product> getall() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from Prod14", (res,num)->{
			Product p=new Product();
			p.setPid(res.getInt(1));
			p.setPname(res.getString(2));
			p.setQty(res.getInt(4));
			p.setPrice(res.getDouble(3));
			return p;
		});
	}
	@Override
	public void save(Product p) {
	  String str="insert into prod14 values(?,?,?,?)";
      jdbcTemplate.update(str,new Object [] {p.getPid(),p.getPname(),p.getPrice(),p.getQty()});
		
	}
	@Override
	public Product findbyid(int pid) {
		try {
		
			return jdbcTemplate.queryForObject("select * from prod14 where pid=?",new Object [] {pid},BeanPropertyRowMapper.newInstance(Product.class));
	        }
		
		catch(EmptyResultDataAccessException e)
		{
			return null;
		}
	}
	@Override
	public void update(Product product) {
		jdbcTemplate.update("update prod14 set pname=?,qty=?,price=? where pid=?",
				new Object [] {product.getPname(),product.getQty(),product.getPrice(),product.getPid()});
		        
		
	}
	@Override
	public void removebyid(int pid) {
	jdbcTemplate.update("delete from prod14 where pid=?" ,new Object[] {pid});
		
	}

		

}
