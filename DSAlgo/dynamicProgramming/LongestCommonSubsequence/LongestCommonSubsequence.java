package com.DSAlgo.dynamicProgramming.LongestCommonSubsequence;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        System.out.println(findLCS("abcde", "ace"));
    }

    private static int findLCS(String text1, String text2) {
        int m=text1.length();
        int n= text2.length();
        int dp[][]= new int[m+1][n+1];

        for (int i = 0; i <=m; i++) {
            dp[i][0]=0;
        }
        for(int j=0;j<=n; j++){
            dp[0][j]=0;
        }
        for(int i=1;i<=m;i++){
            for (int j = 1; j <= n; j++) {
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[i][j] = 1+dp[i-1][j-1];
                }
                else {
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[m][n];
    }
}
