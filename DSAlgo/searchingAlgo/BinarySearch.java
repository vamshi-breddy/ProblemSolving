package com.DSAlgo.searchingAlgo;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = new int[]{76,77,79,86,90,92,95,96};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        System.out.println(binaraysearch(a, target));

    }

    private static int binaraysearch(int[] a, int target) {
        int low=0,high=a.length - 1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(a[mid]==target){
                return mid;
            }
            if(a[mid]<target){
                low =mid+1;
            }
            if(a[mid]> target){
                high = mid-1;
            }
        }
        return -1;

    }
}
