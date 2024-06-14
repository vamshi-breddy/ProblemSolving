package com.DSAlgo.Arrays.SortEvenAndOddNumbers;

public class SortEvenAndOddNumbers {
    public static void main(String[] args) {
        int a[] = new int[] {12, 34, 45, 9, 8, 90, 3};
        int low=0;
        int high = a.length-1;
        int temp;
        while (low < high){

            while(a[low]%2==0 && low<high)
                low++;

            while(a[high]%2==1 && low < high)
                high--;

            if (low < high) {
                temp = a[low];
                a[low] = a[high];
                a[high] = temp;
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
