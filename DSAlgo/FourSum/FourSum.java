package com.DSAlgo.FourSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
         int []nums = new int[] {1,1,1,2,2,2,3,3,3,4,4,4,5,5};
         int n = nums.length;
         int sum;
         int target = 8;
         List<List<Integer>> ans = new ArrayList<>();
         Arrays.sort(nums);

         for (int i = 0; i < n; i++) {
             if(i>0 && nums[i]==nums[i-1]) continue;
             for(int j=i+1;j<n; j++){
                 if(j>i+1 && nums[j] == nums[j-1]) continue;

                 int k=j+1;
                 int l=n-1;

                 while(k<l){
                     sum = nums[i]+nums[j]+nums[k]+nums[l];

                     if(sum==target){
                         List<Integer> temp = new ArrayList<>();
                         temp.add(nums[i]);
                         temp.add(nums[j]);
                         temp.add(nums[k]);
                         temp.add(nums[l]);
                         ans.add(temp);
                         k++;
                         l--;

                         while(k<l && nums[k]==nums[k-1]) k++;
                         while (k<l && nums[l]==nums[l-1])l--;
                     } else if (sum<target) {
                         k++;
                     }
                     else l--;
                 }
             }
         }
        System.out.println(ans);
    }
}
