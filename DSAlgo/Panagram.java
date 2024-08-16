package com.DSAlgo;

public class Panagram {
    public static void main(String[] args) {
        String s = "  The quick brown fox jumps over the lazy Dog  ";

        String s1 = s.trim().toLowerCase();

        System.out.println(pangram(s1));

    }

    private static boolean pangram(String s) {
        if(s.length()<26){
            return false;
        }
        else {
            for(char ch='a';ch<='z';ch++){
                if(s.indexOf(ch)<0){
                    return false;
                }
            }
        }
        return true;
    }
}
