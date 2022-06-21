package com.bubblesort;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		System.out.println("Enter the number of elements in array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
	    for(int i=0;i<n;i++) {
	    	a[i]=sc.nextInt();
	    }
       for(int i=0;i<a.length;i++) {
    	   for(int j=0;j<a.length-1-i;j++) {
    		   if(a[j]>a[j+1]) {
    			temp=a[j];
    			a[j]=a[j+1];
    			a[j+1]=temp;
    		   }
    	   }
       }
       for(int i=0;i<a.length;i++)
       System.out.println(a[i]);
	}

}
