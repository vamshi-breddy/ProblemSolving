package com.functional.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	Predicate<Integer> predicate = t -> t%2==0;
//			
//     System.out.println(predicate.test(9));
     
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
		
		list1.stream().filter(t-> t%2==0).forEach(t->System.out.println("print even"+t));

	}

	

}
