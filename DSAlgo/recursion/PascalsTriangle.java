package com.DSAlgo.recursion;

public class PascalsTriangle {
    public static void main(String[] args) {
        int row=5,column=3; //find the pascal element at 5th column and 3rd element(0th based indexing)
        System.out.println(pascal(row-1, column-1));
    }

    private static int pascal(int r, int c) {
        int res=1;
        int result=1;
        for (int i = 0; i < c; i++) {
            res = res*(r-i);
            result = result*(c-i);
        }
        return res/result;
    }
}



