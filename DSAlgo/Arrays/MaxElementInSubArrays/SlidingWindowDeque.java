package com.DSAlgo.Arrays.MaxElementInSubArrays;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class SlidingWindowDeque {
    public static void main(String[] args) {
        int K = 3;
        int nums[] = new int[]{12, 1, 78, 90, 57, 89, 56};
        Deque<Integer> dq = new LinkedList<Integer>();
        List<Integer> ans = new ArrayList<>();

        for(int i=0;i<K;i++){
            while(!dq.isEmpty() && dq.peekLast()<nums[i]){
                dq.removeLast();
            }
            dq.addLast(nums[i]);
        }
        ans.add(dq.peekFirst());

        for(int i=K;i<nums.length;i++){

            if(dq.peekFirst()==nums[i-K]){
                dq.removeFirst();
            }

            while(!dq.isEmpty() && dq.peekLast()<nums[i]){
                dq.removeLast();
            }
            dq.addLast(nums[i]);
            ans.add(dq.peekFirst());
        }

        ans.stream().forEach(System.out::println);


    }
}
