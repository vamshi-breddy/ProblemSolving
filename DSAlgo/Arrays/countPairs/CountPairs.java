package com.DSAlgo.Arrays.countPairs;

import java.util.HashMap;

public class CountPairs {
    public static void main(String[] args) {
        int []a = new int[]{1,5,7,-1,5};
        int target = 6;
        int count =0;

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int num:a){
            int complement = target-num;

            if(hm.containsKey(complement)){
                count = count+ hm.get(complement);
            }
            else{
                hm.put(num,hm.getOrDefault(num,0)+1);
            }
        }

        System.out.println(count);
    }
}
