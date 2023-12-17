package com.giriharan.TestMart.buisness;

import java.util.ArrayList;
import java.util.List;

import com.giriharan.TestMart.Product;

public class ProductServiceImpl {
	List<String> manga = new ArrayList<>();
	List<Product> mangav2 = new ArrayList<>();
	List<String> gamingConsoles = new ArrayList<>();
	List<Product> gamingConsolesv2 = new ArrayList<>();
	List<String> games =  new ArrayList<>();
	List<Product> gamesv2 =  new ArrayList<>();
	
	
	public ProductServiceImpl() {
		manga.add("Full Metal Alchemist:Brotherhood");
		manga.add("Naruto");
		manga.add("Shingeki no Kyojin");
		mangav2.add(new Product(12,"Full Metal Alchemist:Brotherhood",1000));
		
		gamingConsoles.add("PS4");
		gamingConsoles.add("PS5");
		gamingConsoles.add("Xbox mid af");
		gamingConsolesv2.add(new Product(17,"PS5",55000));
		
		
		games.add("GTA VI");
		games.add("God of War");
		games.add("Read Dead Redemption II");
		gamesv2.add(new Product(13,"Read Dead Redemption II" , 5000));
		
	}
	
	
	public List<String> getProductCategories(){
		List<String> productCategories = new ArrayList<>();
		productCategories.add("Manga");
		productCategories.add("Gaming Consoles");
		productCategories.add("Games");
		return productCategories;
	}
	
	public List<String> getProducts(String choice){
		switch(choice.toLowerCase()) {
		case "manga":
			return manga;
		case "gaming consoles":
			return gamingConsoles;
		case "games":
			return games;
		}
		return null;
	}
	
	public Boolean addProduct(String category,String product){
		switch(category.toLowerCase()) {
		case "manga":
			manga.add(product);
			break;
		case "gaming consoles":
			gamingConsoles.add(product);
			break;
		case "games":
			games.add(product);
			break;
		default:
			return false;
		}
		return true;
	}
	public List<Product> getProductsv2(String choice){
		switch(choice.toLowerCase()) {
		case "manga":
			return mangav2;
		case "gaming consoles":
			return gamingConsolesv2;
		case "games":
			return gamesv2;
		}
		return null;
	}

}
