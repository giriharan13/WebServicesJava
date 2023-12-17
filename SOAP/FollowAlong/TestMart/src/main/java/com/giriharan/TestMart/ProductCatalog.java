package com.giriharan.TestMart;

import java.util.List;

import javax.jws.WebService;

import com.giriharan.TestMart.buisness.ProductServiceImpl;


@WebService(endpointInterface = "com.giriharan.TestMart.ProductCatalogInterface")
public class ProductCatalog implements ProductCatalogInterface{
	
	ProductServiceImpl productService = new ProductServiceImpl();
	
	@Override
	public List<String> getProductCategories(){
		return productService.getProductCategories();
	}
	
	@Override
	public List<String> getProducts(String choice){   // if you change these methods then the wsdl will also change which will affect the clients
		return productService.getProducts(choice);
	}
	
	@Override
	public Boolean addProduct(String category,String product) {
		return productService.addProduct(category, product);
	}
	
	@Override
	public List<Product> getProductsv2(String choice){
		return productService.getProductsv2(choice);
	}

}

/*
 * commit message: I am moving the annotations to the interface(not necessary).But in the older versions this was mandatory.
 */
