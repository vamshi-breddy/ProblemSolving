package com.DSAlgo.patternPrinting;

public class StarPattern {
    public static void main(String[] args) {
        for (int i = 0; i <=5;i++) {
            for(int j=0;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
}
