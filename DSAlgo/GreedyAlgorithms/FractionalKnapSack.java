package com.DSAlgo.GreedyAlgorithms;

import java.util.Arrays;

public class FractionalKnapSack {
    public static void main(String[] args) {
        int n=3, weight=50;

        Item arr[] = {new Item(100,20), new Item(60,10), new Item(120,30)};
        double ans = fractionalKnapsack(weight,arr,n);
        System.out.println("Maximum Value is "+ans);
    }

    private static double fractionalKnapsack(int weight, Item[] arr, int n) {
           Arrays.sort(arr, new ItemComparator());
           double currWeight = 0;
           double finalValue = 0;
           for (int i = 0; i < n; i++) {
               if(currWeight+arr[i].weight<=weight){
                   currWeight = currWeight + arr[i].weight;
                   finalValue = finalValue + arr[i].value;
               }
               else{
                   double remainingWeight = weight - currWeight;
                  finalValue+= ((double)arr[i].value/(double) arr[i].weight) * remainingWeight;
                  break;
               }
           }

        return finalValue;
    }
}
