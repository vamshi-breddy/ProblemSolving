package com.functional.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

//	public class ConsumerDemo implements Consumer<Integer> {

//	@Override
//	public void accept(Integer arg0) {
//		// TODO Auto-generated method stub
//		System.out.println("Printing" +arg0);
//	}
   
	public static void main(String[] args) {
//		Consumer<Integer> consumer=t-> System.out.println("Printing" +t);
//		
//		consumer.accept(10);
		
		List<Integer> list1 = Arrays.asList(1,2,3
				,4,5);
		
		list1.stream().forEach(t-> System.out.println("Printing" +t));
	}
}
