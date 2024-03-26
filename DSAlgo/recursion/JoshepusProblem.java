package com.DSAlgo.recursion;

public class JoshepusProblem {

    public static void main(String[] args) {
        System.out.println(josepus(7,3));
    }

    private static int josepus(int n, int k) {

        if(n==1){
            return 0;
        }
        else{
            return (josepus(n-1,k)+k)%n;
        }
    }
}
