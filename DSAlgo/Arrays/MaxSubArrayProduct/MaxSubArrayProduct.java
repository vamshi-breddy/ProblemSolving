package com.DSAlgo.Arrays.MaxSubArrayProduct;

public class MaxSubArrayProduct {
    public static void main(String[] args) {
       // int a[] = new int[]{2,3,-2,-5,6,-1,4};
        int a[] = new int[]{-2,0,-10};

        int ans = a[0];
        int leftProduct = 1;
        int rightProduct =1;
        for(int i=0;i<a.length;i++){


            leftProduct = leftProduct==0?1:leftProduct;
            rightProduct = rightProduct==0?1:rightProduct;

            leftProduct =leftProduct*a[i];
            rightProduct =rightProduct*a[a.length-1-i];

            ans = Math.max(ans,Math.max(leftProduct,rightProduct));

        }
        System.out.println(ans);
    }
}
