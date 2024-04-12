package com.DSAlgo.math.CountTrailingZeroesInFactorial;

import java.util.Scanner;

public class CountTrailingZeroes {
    public static void main(String[] args) {
        System.out.println("Enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res=0;
        for (int i = 5; i <= n; i=i*5) {
            res = res+n/i;
        }
        System.out.println(res);
    }
}
