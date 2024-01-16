package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="prod14")
public class Product {
@Id
private int id;
private String pname;
private int qty;
private double price;
public Product() {
	super();
}
public Product(int id, String pname, int qty, double price) {
	super();
	this.id = id;
	this.pname = pname;
	this.qty = qty;
	this.price = price;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Product [id=" + id + ", pname=" + pname + ", qty=" + qty + ", price=" + price + "]";
}

}
