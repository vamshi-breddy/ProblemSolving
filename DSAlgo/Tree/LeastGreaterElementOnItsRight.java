package com.DSAlgo.Tree;

import java.util.Arrays;
import java.util.TreeSet;

//Given an array arr, replace every element in that array with a element on its right that is greater than the element and is the
// smallest element among the elements to its right, and replace the last element with -1.
//
//After doing so, return the array.
//Replace every element with the least greater element on its right

public class LeastGreaterElementOnItsRight {
    public static void main(String[] args) {
        int[] arr = {8, 58, 71, 18, 31, 32, 63, 92,43, 3, 91, 93, 25, 80, 28};
        int[] result = replaceElements(arr);

        System.out.println("Output: " + Arrays.toString(result));
    }

    public static int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Arrays.fill(result, -1); // Initialize all elements in result to -1

        TreeSet<Integer> rightElements = new TreeSet<>();

        for (int i = n - 1; i >= 0; i--) {
            Integer higher = rightElements.higher(arr[i]); // Find the smallest element greater than arr[i]
            if (higher != null) {
                result[i] = higher;
            }
            rightElements.add(arr[i]); // Add current element to the set
        }

        return result;

    }
}
