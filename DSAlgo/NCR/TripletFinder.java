package com.DSAlgo.NCR;

import java.util.HashSet;

public class TripletFinder {
    public static int countTriplets(int[] arr) {
        int n = arr.length;
        HashSet<Integer> elements = new HashSet<>();
        int tripletCount = 0;

        // Add all elements to the set for quick lookup
        for (int num : arr) {
            elements.add(num);
        }

        // Iterate through each element in the array
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = arr[i] + arr[j];
                if (elements.contains(sum)) {
                    tripletCount++;
                    System.out.println("Triplet: (" + arr[i] + ", " + arr[j] + ", " + sum + ")");
                }
            }
        }

        return tripletCount;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 6, 10};
        int result = countTriplets(arr);
        System.out.println("Number of triplets: " + result);
    }
}
