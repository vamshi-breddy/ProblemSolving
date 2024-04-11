package com.DSAlgo.CoinChangeProblem;

import java.util.ArrayList;
import java.util.List;

public class CoinChangeProblem {
    public static void main(String[] args) {
        int a[] = new int[]{1,2,5,10,20,50,100,500,1000};
        List<Integer> list = new ArrayList<Integer>();
        int amount =1049;
        int count=0;
        for(int i=a.length-1;i>=0;i--){
            while(a[i]<=amount){
                amount=amount-a[i];
                list.add(a[i]);
            }
        }
        if(amount==0){
            list.stream().forEach(System.out::println);
        }
    }
}
