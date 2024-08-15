package com.DSAlgo.BitManipulation;

import java.util.Scanner;

public class PowerOfTwoorNot {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(checkPowerofTwo(n));

    }

    private static boolean checkPowerofTwo(int n) {
        while(n!=1){

            if(n%2!=0){
                return false;
            }

            n=n/2;
        }
        return true;
    }
}

