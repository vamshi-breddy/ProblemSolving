package com.DSAlgo.Arrays;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {

        int nums[] = new int[]{1,1,5,4,1};

        int i=nums.length-2;

        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }

        if(i>=0){
            int j=nums.length-1;
            while (j>=0 && nums[j]<=nums[i]) j--;
            swapIt(nums,i,j);
        }

        reverseIt(nums,i+1);

        System.out.println(Arrays.toString(nums));
    }

    private static void reverseIt(int[] nums, int start) {
        int end = nums.length-1;
        while (start<end){
            swapIt(nums,start,end);
            start++;
            end--;
        }
    }

    private static void swapIt(int[] nums, int i, int j) {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
