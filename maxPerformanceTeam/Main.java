package com.maxPerformanceTeam;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Enter the size of team");
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int eff[]=new int[n];
        int speed[] = new int[n];
        System.out.println("enter eff array values");
        for (int i = 0; i < n; i++) {
            eff[i] = sc.nextInt();
        }
        System.out.println("enter speed array values");
        for(int i = 0; i < n; i++){
            speed[i]=sc.nextInt();
        }
        int res = calculatePerformance(n,speed,eff);
        System.out.println(res);
    }

    private static int calculatePerformance(int n, int[] speed, int[] eff) {
        Performance[] performance = new Performance[n];
        for (int i = 0; i < n; i++) {
            performance[i] = new Performance(eff[i],speed[i]);
        }
        Arrays.sort(performance,(a, b)->b.eff-a.eff);

        return 1;
    }
}
