package com.giriharan.TestMart;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.giriharan.TestMart.buisness.ProductServiceImpl;


@WebService
public class ProductCatalog {
	
	ProductServiceImpl productService = new ProductServiceImpl();
	
	
	@WebMethod //this annotation is optional because once you have given @WebService to a class , it assumes every public method as a webmethod
	public List<String> getProductCategories(){
		return productService.getProductCategories();
	}
	
	@WebMethod
	public List<String> getProducts(String choice){
		return productService.getProducts(choice);
	}
	
	@WebMethod
	public Boolean addProduct(String category,String product) {
		return productService.addProduct(category, product);
	}

}
