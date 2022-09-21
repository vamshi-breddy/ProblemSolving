package com.DSAlgo.Arrays.TwoSumProblem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSumProblem {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the size of array");
         int size =sc.nextInt();
         int a[] = new int[size];
         for (int i = 0; i < size; i++) {
             a[i]=sc.nextInt();
         }
         System.out.println("Enter the target");
         int target = sc.nextInt();
         int result[]=twoSum(target, a);
         System.out.println(Arrays.toString(result));
     }

    private static int[] twoSum(int target, int[] a) {
         HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
         int []result = new int[2];
         for (int i = 0; i < a.length; i++) {
             if(map.containsKey(target-a[i])){  // value contains actual index, key has the number
                 result[0]=map.get(target - a[i]);
                 result[1]=i;
                 return result;
             }
             else {
                 map.put(a[i],i);
             }
         }
        return result;
    }
}
