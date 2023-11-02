package com.StrongNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r,f,sum=0;
        while (n>0){
            r= n%10;
            f=1;
            for (int i = 1; i <= r;i++) {
                f = f*i;
            }
            sum = sum+f;
            n=n/10;
        }
        System.out.println(sum);

    }
}
