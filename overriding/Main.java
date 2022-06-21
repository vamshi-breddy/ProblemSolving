package com.overriding;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Parent p=new Parent();
      System.out.println(p.getDetails());
      Parent p1=new Child();
      System.out.println(p1.getDetails());
      Child c=new Child();
      System.out.println(c.getDetails());  
	}

}
