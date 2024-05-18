package com.DSAlgo.GoldmanSachs;
//Given a range of numbers [l, r] and an integer q. The task is to count all such number in the given range such that any digit of the number does not match with any digit in its product with the given number q.
//
//Example 1:
//
//Input: l = 10, r = 12, q = 2
//Output: 1
//Explanation:
//10*2 = 20 which has 0 as same digit
//12*2 = 24 which as 2 as same digit
//11*2 = 22 no same digit
//Example 2:
//
//Input: l = 5, r = 15, q = 2
//Output: 9
public class NonRepeatingDigitInProduct {
    public static void main(String[] args) {
        int x=2,y=10,z=15;
        int ans =0;

        for(int i=y;i<=z;i++){
            int product = i*x;
            String iArr = String.valueOf(product);
            char[] arr = String.valueOf(i).toCharArray();
            boolean match = false;
            for(Character c : arr){
                if(iArr.indexOf(c)!=-1){
                    match = true;
                }
            }
            if(!match)
                ans++;
        }
        System.out.println(ans);
    }
}
