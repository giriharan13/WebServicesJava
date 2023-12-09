package com.giriharan.TestMart.buisness;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl {
	List<String> manga = new ArrayList<>();
	List<String> gamingConsoles = new ArrayList<>();
	List<String> games =  new ArrayList<>();
	
	public ProductServiceImpl() {
		manga.add("Full Metal Alchemist:Brotherhood");
		manga.add("Naruto");
		manga.add("Shingeki no Kyojin");
		
		gamingConsoles.add("PS4");
		gamingConsoles.add("PS5");
		gamingConsoles.add("Xbox mid af");
		
		games.add("GTA VI");
		games.add("God of War");
		games.add("Read Dead Redemption II");
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

}
