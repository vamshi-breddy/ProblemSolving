package com.mapReduce;

import java.util.Arrays;
import java.util.List;

public class MapReduce {
  
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(9,2,3,4,5,6);
		
		int summ = numbers.stream().mapToInt(i -> i).sum(); //get sum of integers using sum
		
		System.out.println(summ);
		
		int summ1 = numbers.stream().reduce(0,(a,b)->a+b); //get sum of integers using reduce
		
		System.out.println(summ1);
		
		int evenSum = numbers.stream().filter(x->x%2==0).reduce(0,(a,b)->a+b); //get sum of even numbers
		
		System.out.println(evenSum);
		
		numbers.stream().sorted().forEach(x->System.out.println(x)); //sort the numbers and print each number
	
	}
	
}
