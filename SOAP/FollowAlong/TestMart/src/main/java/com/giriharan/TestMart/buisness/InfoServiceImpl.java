package com.giriharan.TestMart.buisness;

public class InfoServiceImpl {
	
	public String getInfo(String property) {
		if(property.equals("shopName")) {
			return "Test Mart";
		}
		else if(property.equals("startYear")) {
			return "2004";
		}
		return null;
	}
}
