package com.DSAlgo.Arrays.RepeatandMissingNumber;

public class RepeatAndMissingNumber {
    public static void main(String[] args) {
        int a[] = new int[]{1,1,2,3,4,6};
        repeatAndMissingNumber(a);
    }

    private static void repeatAndMissingNumber(int[] a) {

        int n = a.length;

        long Sn = (n*(n+1))/2;

        long S2n = (n*(n+1)*(2*n+1))/6;

        long San = 0,S2an = 0;

        for (int i = 0; i < n; i++) {
            San+= a[i];
            S2an+= a[i]*a[i];
        }

        long value1= San-Sn;

        long value2 = S2an - S2n;

        long x = (value1 + (value2/value1))/2;

        long y = ((value2/value1)-value1)/2;

        System.out.println("Repeated Number "+x+" "+"Missing Number "+y);

    }
}
