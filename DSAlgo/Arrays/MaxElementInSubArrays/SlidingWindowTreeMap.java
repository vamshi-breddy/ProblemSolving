package com.DSAlgo.Arrays.MaxElementInSubArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class SlidingWindowTreeMap {
    public static void main(String[] args) {
        int K = 3;
        int nums[] = new int[]{12, 1, 78, 90, 57, 89, 56 };

        TreeMap<Integer,Integer> treeMap = new TreeMap<Integer, Integer>(Collections.reverseOrder());
        List<Integer> ans = new ArrayList<Integer>();

        for (int i = 0; i < K;i++) {

            treeMap.put(nums[i],i);

        }

        ans.add(treeMap.firstKey());

        for (int i = K; i < nums.length;i++ ) {

            treeMap.remove(nums[i-K]);

            treeMap.put(nums[i], i);

            ans.add(treeMap.firstKey());
        }

        System.out.println(ans);
    }
}
