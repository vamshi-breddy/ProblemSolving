package com.EmployeeStreamDemo;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeStreamDemo {
    static List<Employee> employeeList = new ArrayList<Employee>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   employeeList.add(new Employee(111,"Jiya Brein",32,"Female","HR",2011,25000.0));
	   employeeList.add(new Employee(122,"Paul Niksui",25,"male","Sales and marketing",2015,13500.0));
	   employeeList.add(new Employee(133,"Martin Theron",29,"male","Infrastructure",2012,18000.0));
	   employeeList.add(new Employee(144,"Murali Gowda",28,"male","Product Development",2014,32500.0));
	   employeeList.add(new Employee(155,"Nima Roy",27,"Female","HR",2013,22700.0));
	   employeeList.add(new Employee(166,"Iqbal Hussain",43,"male","security and transport",2016,10500.0));
	   employeeList.add(new Employee(177,"Manu sharma",35,"male","Account and finance",2010,34500.0));
	   employeeList.add(new Employee(188,"Wang Liu",31,"male","Product Development",2015,34500.0));
	   employeeList.add(new Employee(199,"Amelia Zoe",24,"Female","Sales and marketing",2016,11500.0));
	   employeeList.add(new Employee(200,"Jaden Dough",38,"male","security and transport",2015,11000.5));
	   employeeList.add(new Employee(211,"Jasna Kaur",27,"Female","Infrastructure",2014,15700.0));
	   employeeList.add(new Employee(222,"Nitin Joshi",25,"male","Product Development",2016,28200.0));
	   employeeList.add(new Employee(233,"Jyothi Reddy",27,"Female","Account and finance",2013,21300.0));
	   employeeList.add(new Employee(244,"Nicolus Den",24,"male","Sales and marketing",2017,10700.5));
	   employeeList.add(new Employee(255,"Ali Baig",23,"male","Infrastructure",2018,12700.0));
	   employeeList.add(new Employee(266,"Sanvi Pandey",26,"Female","Product Development",2015,28900.0));
	   employeeList.add(new Employee(277,"Anuj Chettiar",31,"male","Product Development",2012,35700.0));

      // 1. How many male and Female employees are there in organization?
	   method1();
	   System.out.println();
	   
	 // 2. Print the name of all departments in the organization
	   method2();
	   System.out.println();

      // 3. What is the average age of male and female Employees
	   method3();
	   System.out.println();
	   
	   // 4.Get the details of highest paid employees in organization
	   method4();
	   System.out.println();
	   
	   //5. Get the Employee details who joined after 2015
	   method5();
	   System.out.println();
	   
	   //6. count the number of employees in each department
	   method6();
	   System.out.println();
	   
	   //7. what is the average salary of each department
	   method7();
	   System.out.println();
	   
	   //8.find the youngest male employee of product development department
	   method8();
	   System.out.println();
	   
	   //9. who has the most working experience in organization
	   method9();
	   System.out.println();
	   
	   //10. how many male and female employees are there in sales and marketing team
	   method10();
	   System.out.println();
	   
	   //11. Average salary of male and female employees
	   method11();
	   System.out.println();
	   
	   //12. List down the names of all employees in each department
	   method12();
	   System.out.println();
	   
	   //13.what is the average salary and total salary of whole organization
	   method13();
	   System.out.println();
	   
	   //14. separate the employees who are younger or equal to 25 years from those employees who are older than 25 years
	   method14();
	   System.out.println();
	   
	   //15. who is the oldest employee in the organization what is his age and which department he belongs to
	   method15();
	   System.out.println();
	   
	   //16. sort the employees based on the age 
	   method16();
	   System.out.println();

	   //17. sort the employees based on age, gender, salary
		method17();
		System.out.println();

		method18();
		System.out.println();

		method19();
		System.out.println();

	}

	private static void method19(){
		System.out.println("Group by employee Department and sort based on their salaries");
		System.out.println(employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.collectingAndThen(Collectors.toList(),
				list -> list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList())))));
	}

	private static void method18() {
		System.out.println("Method18 **********************");
		System.out.println(employeeList.stream().collect(Collectors.groupingBy(Employee::getSalary, Collectors.mapping(Employee::getName,
				Collectors.toList()))).entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).collect(Collectors.toList()).get(2).getKey());
	}

	private static void method17() {
		List<Employee> collect = employeeList.stream().sorted(Comparator.comparing(Employee::getAge).thenComparing(Employee::getName)
				.thenComparing(Employee::getGender)).collect(Collectors.toList());

		System.out.println(collect);
	}

	private static void method16() {
		// TODO Auto-generated method stub
		List<Employee> empSort = employeeList.stream().
				sorted(Comparator.comparing(Employee::getAge).reversed()).collect(Collectors.toList());
//		for(Employee empList: empSort)
		System.out.println(empSort);
	}

	private static void method15() {
		// TODO Auto-generated method stub
		Optional<Employee> oldestEmployeeWrapper = employeeList.stream().max(Comparator.comparing(Employee::getAge));
		Employee oldestEmployee = oldestEmployeeWrapper.get();
		System.out.println("Name:"+oldestEmployee.getName());
		System.out.println("Age:"+oldestEmployee.getAge());
		System.out.println("Department"+oldestEmployee.getDepartment());
	}

	private static void method14() {
		// TODO Auto-generated method stub
		Map<Boolean,List<Employee>> partitionEmployeebyAge = 
				employeeList.stream().collect(Collectors.partitioningBy(e->e.getAge()>25));
		System.out.println(partitionEmployeebyAge);
	}

	private static void method13() {
		// TODO Auto-generated method stub
	   DoubleSummaryStatistics doubleStatistics = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
	   System.out.println(doubleStatistics.getAverage());
	   System.out.println(doubleStatistics.getSum());
	}

	private static void method12() {
		// TODO Auto-generated method stub
		Map<String,List<Employee>> mapEmployee = employeeList.stream().
				collect(Collectors.groupingBy(Employee::getDepartment));
		
		for(Map.Entry<String, List<Employee>> entry :mapEmployee.entrySet())
			System.out.println("key"+ entry.getKey()+"  "+"value="+entry.getValue());
	}

	private static void method11() {
		// TODO Auto-generated method stub
		Map<String, Double> averageSal =employeeList.stream().
				collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(averageSal);
	}

	private static void method10() {
		// TODO Auto-generated method stub
		Map<String,Long> countmaleandFeamle = employeeList.stream().filter(e->e.getDepartment().equals("Sales and marketing")).
		collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		System.out.println(countmaleandFeamle);
	}

	private static void method9() {
		// TODO Auto-generated method stub
		Optional<Employee> seniorMostEmployeeWrapper = employeeList.stream().sorted(Comparator.comparing(Employee::getYearOfjoining)).findFirst();
		Employee seniorMostEmployee = seniorMostEmployeeWrapper.get();
		System.out.println(seniorMostEmployee.getName());
	}

	private static void method8() {
		// TODO Auto-generated method stub
		Optional<Employee> youngest = employeeList.stream()
				.filter(a->a.getGender()=="male" && a.getDepartment()=="Product Development").min(Comparator.comparingInt(Employee::getAge));
	    System.out.println("ID"+youngest.get().id+"-------"+"name"+youngest.get().name);
	}
	private static void method7() {
		// TODO Auto-generated method stub
		System.out.println("what is the average salary of each department");
		Map<String, Double> avgSalaryofDepartments = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
	    System.out.println(avgSalaryofDepartments);
	}

	private static void method6() {
		// TODO Auto-generated method stub
		Map<String,Long> map= employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
	    System.out.println(map);
	}

	private static void method5() {
		// TODO Auto-generated method stub
		System.out.println("5. Get the Employee details who joined after 2015");
		employeeList.stream().filter(e ->e.getYearOfjoining()>2015).map(Employee::getName).forEach(System.out::println);
	}

	private static void method4() {
		// TODO Auto-generated method stub
		System.out.println("4. Get the details of highest paid employees in organizatiosn");
		Optional<Employee> list=employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		System.out.println(list);
	}

	private static void method3() {
		// TODO Auto-generated method stub
		   System.out.println("3. What is the average age of male and female Employees");
           Map<String,Double> average = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
           System.out.println(average);
	}

	private static void method2() {
		// TODO Auto-generated method stub
		System.out.println("2. Print the name of all departments in the organization");
		employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
	}

	private static void method1() {
		// TODO Auto-generated method stub
		System.out.println("1. How many male employees are there and female employees are there");
		Map<String,Long> oneList = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
	    System.out.println(oneList);
	}

}
