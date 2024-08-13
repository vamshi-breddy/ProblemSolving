package com.DSAlgo.sorting.CyclicSort;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int a[] = new int[]{1,5,4,2,3};
        cycleSort(a);
        System.out.println(Arrays.toString(a));
    }

    private static void cycleSort(int[] a) {
        int i=0;

        while(i<a.length){
            int correct = a[i];

            if(a[i]!=a[correct-1]){
                int temp = a[correct-1];
                a[correct-1]=a[i];
                a[i]=temp;
            }
            else {
                i++;
            }
        }
    }
}
