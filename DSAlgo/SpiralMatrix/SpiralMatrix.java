package com.DSAlgo.SpiralMatrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int [][] mat = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        int row = mat.length;
        int col = mat[0].length;
        List<Integer> ans = spiral(mat,row,col);
        System.out.println(ans);
    }

    private static List<Integer> spiral(int[][] mat, int row, int col) {


        List<Integer> ans = new ArrayList<Integer>();

        int left=0, right=col-1;
        int top=0, bottom=row-1;

        while(top <= bottom && left <= right){
            for(int i=left;i<=right;i++){
                ans.add(mat[top][i]);
            }
            top++;

            for(int i=top;i<=bottom;i++){
                ans.add(mat[i][right]);
            }
            right--;

            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    ans.add(mat[bottom][i]);
                }
                bottom--;
            }
            if(left<=right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(mat[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}
