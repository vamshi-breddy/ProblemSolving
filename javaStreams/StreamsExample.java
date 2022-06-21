package com.javaStreams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class StreamsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<Employee> empList=new ArrayList<>();
      
      empList.add(new Employee(101,"siva",101,"active",2000));
      empList.add(new Employee(102,"reddy",101,"active",5000));
      empList.add(new Employee(103,"raju",102,"active",6000));
      empList.add(new Employee(104,"shivam",102,"active",4000));
      empList.add(new Employee(105,"bob",103,"active",3500));
      empList.add(new Employee(106,"alice",103,"Inactive",3500));
      empList.add(new Employee(107,"srinu",104,"active",3500));
      
      //empList based on department
      
      Map<Integer, List<Employee>> empListBasedonDeptId = empList.stream().
    		  collect(Collectors.groupingBy(Employee::getDeptId,Collectors.toList()));
      
      
      empListBasedonDeptId.entrySet().forEach(entry -> {
    	  System.out.println(entry.getKey()+"---------"+entry.getValue());
      });
      
      //empCount based on each department
      Map<Integer,Long> empCount = empList.stream().collect(Collectors.groupingBy(Employee::getDeptId,Collectors.counting()));
          
      empCount.entrySet().forEach(entry ->{
    	  System.out.println("dept"+entry.getKey()+"--"+entry.getValue());
      });
      
      //empList based on active status
      
      long activeCount=empList.stream().filter(e->"active".equals(e.getStatus())).count();
      
      System.out.println(activeCount+"activeCount");
      
      //get the maximum and minimum salary of employees in list
      
     Optional<Employee> emp1= empList.stream().max(Comparator.comparing(Employee::getSalary));
     
     Optional<Employee> emp2= empList.stream().min(Comparator.comparing(Employee::getSalary));

      System.out.println(emp1);
      
      System.out.println(emp2);
      
      //print the max salary of an employee from each department
      
     Map<Integer,Optional<Employee>> salDept = empList.stream().collect(Collectors.groupingBy(Employee::getDeptId,
    		  Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));
     
     System.out.println(salDept);
     
//     
//     List<Employee> list = ...
//    		 list.sort(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName));
     
     
	}

}
