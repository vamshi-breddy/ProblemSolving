package com.DSAlgo.Arrays.TrappingRainWaterProblem;

public class TrappingRWTwoPointerApproach {
    //https://www.youtube.com/watch?v=EdR3V5DBgy
    public static void main(String[] args) {
        int[] height = new int[] {0,1,0,2,1,0,1,3,2,1,2,1};
        int maxleft=0,maxRight=0,water=0;
        int i=0,j=height.length-1;

        while(i<j){
            if(height[i]<=height[j]){
                maxleft = Math.max(maxleft,height[i]);
                water = water+(maxleft - height[i]);
                i++;
            }
            else {
                maxRight = Math.max(maxRight, height[j]);
                water = water + (maxRight - height[j]);
                j--;
            }
        }
        System.out.println(water);
    }
}
