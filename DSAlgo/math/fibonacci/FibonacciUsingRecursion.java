package com.DSAlgo.math.fibonacci;

import java.util.Scanner;

public class FibonacciUsingRecursion {

    //0,1,1,2,3,5,8,13,21,34,55,89;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }

    private static int fibonacci(int n) {
        if(n==0 || n==1){
            return 1;
        }
        else {
            return fibonacci(n-1)+fibonacci(n-2);
        }

    }
}
