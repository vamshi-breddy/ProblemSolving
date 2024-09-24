package com.DSAlgo.Arrays;

import java.util.ArrayList;
import java.util.List;

public class LeaderInArray {
    public static void main(String[] args) {

        int a[] = new int[]{13,14,3,8,2};

        int size = a.length;

        int max=a[size-1];

        List<Integer> list = new ArrayList<>();

        for(int i=size-2;i>=0;i--){

            if(a[i]>max){
                list.add(a[i]);
                max=a[i];
            }
        }
        System.out.println(list.reversed());
    }
}
