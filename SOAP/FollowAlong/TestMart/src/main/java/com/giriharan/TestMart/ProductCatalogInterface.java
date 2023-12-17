package com.giriharan.TestMart;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface ProductCatalogInterface {  // AKA Service Endpoint Interface(SEI)
	
	@WebMethod //this annotation is optional because once you have given @WebService to a class , it assumes every public method as a webmethod
	public abstract List<String> getProductCategories();
	
	@WebMethod
	public abstract List<String> getProducts(String choice);
	
	@WebMethod
	public abstract Boolean addProduct(String category,String product);
	
	@WebMethod
	@WebResult(name="product")  // to change the tag name of result
	public abstract List<Product> getProductsv2(String choice);
	
}
