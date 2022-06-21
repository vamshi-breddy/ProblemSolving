package com.priorityQueue;

public class FindingNthLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[]=new int[] {12,13,2,4,5,7,86,5};
       int n=a.length;
       int k=4;
       FindNumber num=new FindNumber();
       int result=num.getNumber(n, k, a);
       System.out.println(result);
	}

}
