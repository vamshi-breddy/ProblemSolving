package com.facadePattern;

public class Pasta implements Food {

	public String preparedItem;

	public void prepareFood(String itemRequired) {
		// TODO Auto-generated method stub
		preparedItem = "Tomato Pasta with ingredients-"+itemRequired;

	}

	public String deliverFood() {
		// TODO Auto-generated method stub
		return preparedItem;
	}


}
