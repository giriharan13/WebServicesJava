package com.giriharan.TestMart.buisness;

import com.giriharan.TestMart.InvalidInputException;

public class InfoServiceImpl {
	
	public String getInfo(String property) throws InvalidInputException {
		String response;
		if(property.equals("shopName")) {
			response = "Test Mart";
		}
		else if(property.equals("startYear")) {
			response = "2004";
		}
		else {
			throw new InvalidInputException("Invalid Property", property+"is not valid");
		}
		return response;
	}
}
