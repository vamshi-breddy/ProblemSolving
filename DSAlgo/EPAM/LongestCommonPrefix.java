package com.DSAlgo.EPAM;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
          String[] strs = {"geeksforgeeks","geeks","geek","geezer"};
        System.out.println(findCommonPrefix(strs));
    }

    private static String findCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0){
            return "-1";
        }

        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length-1];

        int min = Math.min(first.length(),last.length());

        int i=0;

        while(i<min && first.charAt(i)==last.charAt(i)){
            i++;
        }

        if(i==0)
            return "-1";

        return first.substring(0,i);
    }
}
