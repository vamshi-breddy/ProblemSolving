package com.MinimumPlatforms;

import java.util.Arrays;

public class FindNumberOfPlatforms {

    public int findNumberOfPlatforms(int []arr, int []dep, int n){
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=1,j=0;
        int requiredPlatforms=1,platforms=1;
        while (i<n && j<n){
           if(arr[i]<=dep[j]){
               requiredPlatforms++;
               i++;
           }
           else if (arr[i]>dep[j]) {
               requiredPlatforms--;
               j++;
           }
           if (requiredPlatforms>platforms){
               platforms=requiredPlatforms;
           }
        }
        return platforms;
    }
}
