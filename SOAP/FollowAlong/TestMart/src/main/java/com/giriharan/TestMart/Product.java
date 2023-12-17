package com.giriharan.TestMart;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="Product") // to tell jaxb that this is a root element
@XmlType(propOrder = {"name","price","id"}) // propOrder to specify the order of variables in xml
public class Product {
	int id;
	String name;
	int price;
	
	public Product() {
		                      // we need to provide a constructor with no arguments for jaxb to create instances
	}
	
	public Product(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@XmlElement(name="ProductName") // to change the variable tag name in xml
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
