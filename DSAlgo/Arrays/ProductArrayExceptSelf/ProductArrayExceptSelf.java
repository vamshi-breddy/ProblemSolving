package com.DSAlgo.Arrays.ProductArrayExceptSelf;

import java.util.Arrays;

public class ProductArrayExceptSelf {
    public static void main(String[] args) {
        int []a = new int[]{1,2,3,4};
        int []b = new int[a.length];
        int prefix =1;
        b[0] = prefix;
        for(int i=1;i<a.length;i++){
            prefix = prefix*a[i-1];
            b[i] = prefix;
        }
        System.out.println(Arrays.toString(b));

        int suffix =1;
        int right = a.length-1;

        while(right>=0 && right-1>=0){
            suffix= suffix*a[right];
            b[right-1] = b[right-1]*suffix;
            right--;
        }

        System.out.println(Arrays.toString(b));

    }
}
