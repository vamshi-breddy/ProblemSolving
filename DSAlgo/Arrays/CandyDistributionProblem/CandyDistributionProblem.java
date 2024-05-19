package com.DSAlgo.Arrays.CandyDistributionProblem;

import java.util.HashSet;
import java.util.Set;

public class CandyDistributionProblem {
    public static void main(String[] args) {
       int[] candyType = new int[] {
               1,1,2,2,3,3
       };
        System.out.println(distributeCandies(candyType));
    }

    private static int distributeCandies(int[] candyType) {
        Set<Integer> set= new HashSet<Integer>();
        for(int v:candyType){
            set.add(v);
        }
        int x = set.size();
        int n = candyType.length;

        if(n/2<=x)
            return n/2;
        else if(n/2>x)
            return x;
        return 0;
    }
}
