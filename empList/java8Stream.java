package com.empList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//evaluation map and flatmap

public class java8Stream {
	
	public static void main(String[] args) {
		List<Employee> empList=createEmployee();
		
	    empList.stream().filter(emp->emp.getAge()>25).collect(Collectors.toList()).
				forEach(emp -> System.out.println(emp));
	    
	    List<String> emp2=empList.stream().map(emp -> emp.getName()).collect(Collectors.toList());
	    
	    List<List<String>> phones = empList.stream().map(emp -> emp.getPhoneNumbers()).collect(Collectors.toList());
	    
	    List<String> phones1 =empList.stream().flatMap(emp -> emp.getPhoneNumbers().stream()).
	    		collect(Collectors.toList());
	    
	   Map<String, List<Employee>> empSort= empList.stream().sorted(Comparator.comparing(e->e.getName()))
			   .collect(Collectors.groupingBy(Employee::getName));
	   
	    System.out.println(emp2+"map");
	    System.out.println(phones+"flatMap");
	    System.out.println(phones1+"flatMap");
	    
	   
	    System.out.println(empSort+"empsort");

	}
	

	private static List<Employee> createEmployee() {
		List<Employee> empList= new ArrayList<>();
		Employee e1= new Employee("Amit","1",21,Arrays.asList("123","1234","9876"));
		Employee e2 = new Employee("Raj","2",32,Arrays.asList("123","0987","3456"));
		Employee e3= new Employee("vamshi","3",13,Arrays.asList("8756","2323","3434"));
		Employee e4= new Employee("reddy","4",22,Arrays.asList("123","3434","3434"));
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		// TODO Auto-generated method stub.
		return empList;
	}

}
