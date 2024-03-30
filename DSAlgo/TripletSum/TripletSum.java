package com.DSAlgo.TripletSum;

import java.util.Arrays;

public class TripletSum {
    public static void main(String[] args) {
        int []a = new int[]{12,3,4,1,6,9};
        int sum=24;
        int low,high;
        Arrays.sort(a);//1,3,4,6,9,12
       for(int i=0;i<a.length-2;i++){
           low=i+1;
           high=a.length-1;
           while(low<high){
               if(a[i]+a[low]+a[high]==sum){
                   System.out.println(a[i]+" "+a[low]+" "+a[high]);
                   break;
               } else if (a[i]+a[low]+a[high]<sum) {
                   low++;
               } else if (a[i]+a[low]+a[high]>sum) {
                   high--;
               }
           }
       }
    }
}
