package com.secondLargest;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int largest=Integer.MIN_VALUE,secondLargest=Integer.MIN_VALUE;
       int [] array=new int[] {10,32,55,69,69,78,78,67};
       for(int i=0;i<array.length;i++) {
    	   if(array[i]>largest) {
			   secondLargest=largest;
			   largest=array[i];
    	   } else if (array[i]> secondLargest && array[i] < largest) {
			   secondLargest = array[i];
		   }
	   }
       System.out.println(secondLargest);
	}

}
