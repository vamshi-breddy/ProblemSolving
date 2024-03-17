package com.ReverseString;

public class ReverseString {
    public static void main(String[] args) {
        String s="Vamshi";

        char[] c = new char[s.length()];
        c=s.toCharArray();
        int i = 0, j=s.length();
        char temp;

        while (i < j) {
            temp = c[i];
            c[i] = c[j-1];
            c[j-1] = temp;
            i++;
            j--;
        }
        for (i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}
