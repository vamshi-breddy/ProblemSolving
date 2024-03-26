package com.DSAlgo.KadanesAlgorithm;


public class MaxSubArraySum {
    public static void main(String[] args) {
        int [] a = new int[] {-2,-3,4,-1,-2,1,5,-3};

        int sum=0,max=0;

        for (int i = 0; i < a.length; i++) {
            sum = sum+a[i];
            if(sum<0){
                sum = 0;
            }
            else if(sum>max){
                max=sum;
            }
        }
        System.out.println(max);
    }

}
