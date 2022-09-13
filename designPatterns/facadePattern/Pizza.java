package com.facadePattern;

public class Pizza implements Food {

	public String preparedItem;
	
	
	public void prepareFood(String itemRequired) {
		// TODO Auto-generated method stub
		preparedItem = "Thin Crust pizza with ingredients-"+itemRequired;
	}

	public String deliverFood() {
		// TODO Auto-generated method stub
		return preparedItem;
	}

}
