package com.DSAlgo.Arrays.MaxElementInSubArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class SlidingWindowHeap {
    public static void main(String[] args) {
        int K = 3;
        int nums[] = new int[]{12, 1, 78, 90, 57, 89, 56 };
        List<Integer> ans = new ArrayList<Integer>();
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->b.value-a.value);

        for (int i = 0; i < K; i++) {

            pq.offer(new Pair(nums[i],i));

        }
        ans.add(pq.peek().value);

        for (int i = K; i < nums.length; i++) {
            pq.offer(new Pair(nums[i], i));

            while (pq.peek().index<=i-K){
                pq.poll();
            }

            ans.add(pq.peek().value);
        }

        System.out.println(ans.toString());
    }

    static class Pair{
        int index;
        int value;

        Pair(int value, int index) {
            this.index = index;
            this.value = value;
        }
    }
}


