package com.DSAlgo.Arrays.JumpGameLeetCode55;

public class JumpGame {

    public static void main(String[] args) {
//        int []a = new int[]{2,3,1,1,4};
//        int []a = new int[]{1,1,2,5,2,1,0,0,1,3};
        int []a = new int[]{3,2,1,0,4};
        int goal = a.length-1;
        for(int i=a.length-2;i>=0;i--){
            if(i+a[i]>=goal){
                goal=i;
            }
        }
        System.out.println(goal==0);
    }
}
