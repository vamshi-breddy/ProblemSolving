package com.DSAlgo.dynamicProgramming.countSubmatriceswithOnes;

public class SubmatriceswithOnes {
    public static int countSubmatrices(int n, int m, int[][]arr){
           int[][] dp=new int[n][m];
           for(int i = 0; i < n; i++) dp[0][i] = arr[0][i];
           for (int j = 0; j < m; j++) dp[j][0] = arr[j][0];

           for(int i=1;i< n; i++){
               for (int j = 1; j < m; j++)
               {
                    if(arr[i][j] == 0) dp[i][j] = 0;
                    else {
                        dp[i][j] = 1+Math.min(dp[i-1][j], Math.min(dp[i-1][j-1],dp[i][j-1]));
                    }
               }
           }

           int sum = 0;
           for(int i=0;i<n;i++){
               for (int j = 0; j < m; j++) {
                   sum += dp[i][j];
               }
           }
        return sum;
    }
}
