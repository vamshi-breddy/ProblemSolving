package com.DSAlgo.CogInterview.AnagramJava8;

import java.util.Arrays;

public class AnagramJava8 {
    public static void main(String[] args) {
        String str1 = "Vamshi";
        String str2 = "ishmaV";

        str1 = str1.replaceAll("\\s","").toLowerCase();
        str2 = str2.replaceAll("\\s","").toLowerCase();

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        System.out.println(Arrays.equals(charArray1, charArray2));
    }
}
