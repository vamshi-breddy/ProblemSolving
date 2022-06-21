package com.secondLargest;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int largest=0,secondLargest=0;
       int [] array=new int[] {10,9,8,7,6,9,9};
       for(int i=0;i<array.length;i++) {
    	   if(array[i]>largest) {
    		   largest=array[i];
    		   secondLargest=largest;
    	   }
    	   else {
    		   secondLargest=array[i];
    	   }
       }
       System.out.println(secondLargest);
	}

}
