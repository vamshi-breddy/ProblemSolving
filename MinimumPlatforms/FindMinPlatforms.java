package com.MinimumPlatforms;

import java.util.Scanner;

public class FindMinPlatforms {

    public static void main(String[] args) {
        FindNumberOfPlatforms findMinPlatforms = new FindNumberOfPlatforms();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array size");
        int N =input.nextInt();
        int []arr =new int[N];
        int []dep =new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < N; i++) {
            dep[i] = input.nextInt();
        }
        System.out.println(findMinPlatforms.findNumberOfPlatforms(arr,dep,N));

    }

}
