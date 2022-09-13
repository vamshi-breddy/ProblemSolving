package com.facadePattern;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//     Ingredient ingredient = new Ingredient();
//     
//     System.out.println("without Facade ---------");
//     Food pasta =new Pasta();
//     String pastaItems = ingredient.getPastaItems();
//     pasta.prepareFood(pastaItems);
//     System.out.println(pasta.deliverFood());
//     
//     Food pizza = new Pizza();
//     String pizzaItems = ingredient.getPizzaItems();
//     pizza.prepareFood(pizzaItems);
//     System.out.println(pizza.deliverFood());
     
     System.out.println();
     
     System.out.println("with Facade ------------");
     
     Waiter waiter = new Waiter();
     System.out.println(waiter.deliverFood(FoodType.PASTA));
     System.out.println(waiter.deliverFood(FoodType.PIZZA));
     
	}

}
