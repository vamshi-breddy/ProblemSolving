package com.DSAlgo.dynamicProgramming.countSubmatriceswithOnes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SubmatriceswithOnes submatriceswithOnes = new SubmatriceswithOnes();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(submatriceswithOnes.countSubmatrices(n, m, arr));
    }
}
