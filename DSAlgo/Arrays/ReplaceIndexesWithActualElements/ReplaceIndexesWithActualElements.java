package com.DSAlgo.Arrays.ReplaceIndexesWithActualElements;

public class ReplaceIndexesWithActualElements {

    public static void main(String[] args) {
        int[] a= new int[] {3,2,4,1,0};
        int[] res = new int[5];
        for (int i = 0; i < a.length; i++) {
            res[a[i]] =i;
        }
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }

    }
}
