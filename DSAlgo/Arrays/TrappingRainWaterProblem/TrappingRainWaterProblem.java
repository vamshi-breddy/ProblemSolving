package com.DSAlgo.Arrays.TrappingRainWaterProblem;

public class TrappingRainWaterProblem {
    public static void main(String[] args) {
         int[] height = new int[] {0,1,0,2,1,0,1,3,2,1,2,1};
         int water = 0;
         int n = height.length;
         int[] leftMax = new int[n];
         int[] rightMax = new int[n];
         for (int i = 0; i < height.length; i++) {
             if(i==0){
                 leftMax[0] = height[0];
                 rightMax[n-1] = height[n-1];
             }
             else {
                 leftMax[i] = Math.max(height[i],leftMax[i-1]);
                 rightMax[n-1-i] = Math.max(rightMax[n-i],height[n-1-i]);
             }
         }

         for (int i = 0; i < height.length; i++) {
             water+= Math.min(leftMax[i],rightMax[i])-height[i];
         }

        System.out.println(water);
    }
}
