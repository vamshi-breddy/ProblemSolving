package com.DSAlgo.cognida.ai.MaxInBiotnicArray;

public class MaxInBiotnicArray {
    public static void main(String[] args) {
        int a[] = new int[]{1, 3, 50, 10, 9, 7, 6};
        //                  0, 1,  2,   3,  4,   5,   6,   7,  8, 9, 10;
        int n = a.length;
        System.out.println(maxInBitonicArray(a, 0, n - 1));

    }

    private static int maxInBitonicArray(int[] a, int low, int high) {

          while (low<=high){
               int mid =low+((high-low)/2);

               if(low==high)
                   return a[low];

               if(high==low+1 && a[high]>=a[low])
                   return a[high];

               if(high==low+1 && a[low]>a[high])
                   return a[low];

               if(a[mid]>a[mid-1] && a[mid]>a[mid+1])
                   return a[mid];

               if(a[mid]>a[mid + 1] && a[mid]<a[mid-1])
                   high = mid-1;
               else
                   low =mid+1;


          }
        return -1;
    }
}
