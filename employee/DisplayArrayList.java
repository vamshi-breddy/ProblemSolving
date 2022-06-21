package com.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DisplayArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<Employee> list=new ArrayList<Employee>();
      
      list.add(new Employee(1,"Vamshi","Hyderabad"));
      list.add(new Employee(88,"Reddy","Hyderabad"));
      list.add(new Employee(3,"B","Kolkatta"));
	 

      for(Employee s:list) {
    	  System.out.println(s.getId()+"---"+s.getName()+"----"+s.getCity());
      }
      List<Employee> newList=list.stream().distinct().collect(Collectors.toList());
      
      for(Employee s:newList) {
    	  System.out.println(s.getId()+"---"+s.getName()+"----"+s.getCity());
      }
	}

}
