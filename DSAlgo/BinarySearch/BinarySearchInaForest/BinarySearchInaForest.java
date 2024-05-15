package com.DSAlgo.BinarySearch.BinarySearchInaForest;

public class BinarySearchInaForest {
    public static void main(String[] args) {
        int a[] = new int[]{1, 7, 6, 3, 4, 7};
        int k=8;
        System.out.println(findCutting(a, k));
    }

    private static int findCutting(int[] a, int k) {
        int high = Integer.MIN_VALUE;
        int low = 0;
        for (int i = 0; i < a.length; i++) {
            high = Math.max(high, a[i]);
        }
        int wood;
        int mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            wood = collectWood(mid, a);
            if (wood == k) {
                return mid;
            } else if (wood > k) {
                low = mid + 1;
            } else if (wood < k) {
                high = mid - 1;
            }
        }


        return mid;
    }

    private static int collectWood(int mid,int[] a) {
        int wood = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>mid){
                wood+= a[i]-mid;
            }
        }
        return wood;
    }
}
