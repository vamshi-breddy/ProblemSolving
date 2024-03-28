package com.DSAlgo.DutchNationalFlagAlgorithm;

import java.util.Arrays;

public class DutchNationalFlagAlgorithm {
    public static void main(String[] args) {
        int []a = new int[]{0,1,0,0,0,2,2,2,1,1,1,1};

        int l=0;
        int mid=0;
        int high=a.length-1;
        int temp;

        while(mid<=high){
            switch (a[mid])
            {
                case 0 :
                    temp = a[mid];
                    a[mid]=a[l];
                    a[l] = temp;
                    l++;
                    mid++;
                    break;
                case 1: mid++;
                    break;
                case 2:
                temp = a[mid];
                a[mid] = a[high];
                a[high] = temp;
                    high--;
                    break;
            }
        }

        Arrays.stream(a).forEach(System.out::println);

    }


}
