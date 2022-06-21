package com.lengthOfString;

import java.util.ArrayList;
import java.util.List;

public class LengthOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<String> list = new ArrayList<>();
       list.add("foo");
       list.add("bar");
       list.add("baza");
       list.stream().map(s->s.length()).forEach(System.out::println);
       
       method("madam");
       }

	private static void method(String string) {
		// TODO Auto-generated method stub
		
	}
}