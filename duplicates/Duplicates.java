package com.duplicates;

import java.util.Scanner;

public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) {
        	a[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++) {
        	for(int j=i+1;j<n;j++) {
        		if(a[i]==a[j]) {
        			count++;
        		}
        	}
        }
        
        int a1[]=new int[n-count];
         
	}

}
