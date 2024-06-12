package com.DSAlgo.Arrays.MergeTwoSortedArrays;

import java.util.Arrays;
//https://www.youtube.com/watch?v=C4oBXLr3zos
public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = new int[] {1,2,3,0,0,0};
        int[] nums2 = new int[] {2,5,6};
        int m =3;
        int n= 3;
        int p1 = m-1,p2=n-1;
        int i=nums1.length-1;
        while(p1>=0 && p2>=0){
            if(nums2[p2]>nums1[p1]){
                nums1[i--] = nums2[p2--];
            } else if (nums1[p1]>nums2[p2]) {
                nums1[i--] = nums1[p1--];
            }
            else if (nums1[p1]==nums2[p2]) {
                nums1[i] = nums1[p1];
                i--;
                p1--;
                p2--;
            }
        }

        Arrays.stream(nums1).forEach(System.out ::println);
    }
}
