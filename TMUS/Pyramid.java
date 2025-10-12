package com.TMUS;

public class Pyramid {
    public static void main(String[] args) {
        printPyramid(9);
    }

    private static void printPyramid(int rows) {

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i*2;k++){
                System.out.print(i);
            }
            for(int l=1;l<=rows-i;l++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
