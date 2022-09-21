package com.DSAlgo.math;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a=0,b=1;
       int c;
       System.out.println(a);
       System.out.println(b);
       while(n>0) {
    	   c=a+b;
           a=b;
           b=c;  
           System.out.println(c);
           n--;
       }
      
	}
}
