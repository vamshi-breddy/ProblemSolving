package com.DSAlgo.Arrays.MaxElementInSubArrays;

import java.util.ArrayList;
import java.util.List;

public class MaxElementsInSubArrays {
    public static void main(String[] args) {
        int K = 3;
        int a[] = new int[]{1,2,3,1,4,5,2,3,6};
        int max;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<=a.length-K;i++){
            max=0;
            for (int j = i; j < i+K; j++) {
                max = Math.max(max,a[j]);
            }
            list.add(max);
        }

        list.stream().forEach(System.out::println);

    }
}
