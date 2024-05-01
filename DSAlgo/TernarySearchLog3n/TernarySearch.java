package com.DSAlgo.TernarySearchLog3n;

public class TernarySearch {
    public static void main(String[] args) {
        int a[] = new int[]{7, 12, 19, 24, 31, 48, 51, 63, 67, 73, 81, 92};
        int k = 19;
        int low = 0;
        int high = a.length - 1;
        System.out.println(ternarySearch(a, k, low, high));
    }

    private static int ternarySearch(int[] a, int k, int low, int high) {
        int mid1;
        int mid2;
        while (low < high) {
            mid1 = low + (high - low) / 3;
            mid2 = high - (high - low) / 3;

            if (k == a[mid1]) {
                return mid1;
            } else if (k == a[mid2]) {
                return mid2;
            } else if (k < a[mid1]) {
                high = mid1 - 1;
            } else if (k > a[mid2]) {
                low = mid2 + 1;
            } else {
                low = mid1 + 1;
                high = mid2 - 1;
            }
        }
        return -1;
    }
}

