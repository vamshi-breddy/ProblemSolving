package com.singleton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Singleton s1=Singleton.getInstance();
     Singleton s2=Singleton.getInstance();
     
     System.out.println(s1);
     System.out.println(s2);
     
	}

}
