package com.weekDaysSorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WeekDaysSortingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<String> input1 = Arrays.asList("MONDAY","FRIDAY","THURSDAY","TUESDAY","SUNDAY","WEDNESDAY","SATURDAY");
      
      List<String> input2 = Arrays.asList("SUNDAY","SATURDAY","TUESDAY","WEDNESDAY");
      
      List<String> input3 = Arrays.asList("MONDAY","THURSDAY","TUESDAY");
      
      List<String> input4 = Arrays.asList("MONDAY","SATURDAY","THURSDAY","SUNDAY");
      
      System.out.println("input :"+input1);
      Collections.sort(input1,new WeekdaysComparator());
      System.out.println("output :"+input1);
      System.out.println();

      
      System.out.println("input :"+input2);
      Collections.sort(input2,new WeekdaysComparator());
      System.out.println("output :"+input2);
      System.out.println();

      System.out.println("input :"+input3);
      Collections.sort(input3,new WeekdaysComparator());
      System.out.println("output :"+input3);
      System.out.println();
      
      System.out.println("input :"+input4);
      Collections.sort(input4,new WeekdaysComparator());
      System.out.println("output :"+input4);
      System.out.println();
      
	}

}
