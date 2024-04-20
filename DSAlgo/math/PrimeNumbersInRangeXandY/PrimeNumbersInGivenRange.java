package com.DSAlgo.math.PrimeNumbersInRangeXandY;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbersInGivenRange {
    public static void main(String[] args) {
        int x=3,y=10,z=20;
        int count = 0;
        List<Integer> list = new ArrayList<Integer>();
        for(int i=y;i<=z;i++){
            count=0;
            for (int j = 1; j <= i; j++) {
                if(i%j==0){
                    count++;
                }
            }
            if(count==2 && list.size()<3){
                list.add(i);
            }
        }

        list.stream().forEach(System.out::println);
    }
}
