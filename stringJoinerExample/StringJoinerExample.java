package com.stringJoinerExample;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoinerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String input ="Hello How are you";
      
      String[] inputArray = input.split("");
      
      StringJoiner joiner =new StringJoiner("-","[","]");
      
      for(String s: inputArray) {
    	  joiner.add(s);
      }
      
      System.out.println(joiner);
      
      List<String> inputList = Arrays.asList("Hello","How","are","you");
      
      String usingStream = inputList.stream().collect(Collectors.joining("-"));
      
      System.out.println(usingStream);
	}

}
