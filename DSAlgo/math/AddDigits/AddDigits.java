package com.DSAlgo.math.AddDigits;

//Given a non-negative Integer number, repeatedly add all its digits until the result has only one digit
//for example 38=3+8=11=1+1=2

import java.util.Scanner;

public class AddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        while (n > 9) {
            n=n-9;
        }
        System.out.println(n);
    }

}
