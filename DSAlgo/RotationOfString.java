package com.DSAlgo;

public class RotationOfString {

    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "CDAB";

        if(str1.length()==str2.length() && (str1+str2).indexOf(str2)!=-1){
            System.out.println("str2 present in str1");
        }
    }
}
