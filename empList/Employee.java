package com.empList;

import java.util.List;

public class Employee {
 
	private String name;
	
	private String id;
	
	private int age;
	
	private List<String> phoneNumbers;
	
	public Employee(String name,String id,int age, List<String> phoneNumbers) {
		this.name=name;
		this.id=id;
		this.age=age;
		this.phoneNumbers=phoneNumbers;
	}

	public List<String> getPhoneNumbers(){
		return phoneNumbers;
	}
	
	public void setPhoneNumbers(List<String> phoneNumbers) {
	   this.phoneNumbers=phoneNumbers;	
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
