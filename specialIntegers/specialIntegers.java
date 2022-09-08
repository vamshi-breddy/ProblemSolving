package com.specialIntegers;

import java.util.Scanner;

public class specialIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int count = solution(n);
        System.out.println(count);
    }

    private static int solution(int n) {
        int count = 0;
        for(int i=1;i<=n;i++){
            if(spec(i)) count++;
        }
        return count;
    }

    private static boolean spec(int num) {
        int []a=new int[10];
        while (num>0){
            if(a[num%10]>0) return false;
            a[num % 10]++;
            num /= 10;
        }
        return true;
    }
}
