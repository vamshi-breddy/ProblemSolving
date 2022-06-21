package com.reverseNumber;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0,rev;
		while(num>0)
		{
		rev=num%10;
	    System.out.println(rev+"rev");
		sum=sum*10+rev;
		num=num/10;
		}
       System.out.println(sum);
	}
}
