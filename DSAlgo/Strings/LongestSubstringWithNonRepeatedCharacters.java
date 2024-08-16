package com.DSAlgo.Strings;

import java.util.HashSet;
//https://www.youtube.com/watch?v=sqxer2ynS6U
public class LongestSubstringWithNonRepeatedCharacters {
    public static void main(String[] args) {
        String s = "abcdaabcde";

        HashSet<Character> hashSet = new HashSet<>();
        String longestTillNow = "";
        String longestOverall="";

        for (int i=0;i<s.length();i++){

            if(hashSet.contains(s.charAt(i))){
                  hashSet.clear();
                  longestTillNow="";
            }
            hashSet.add(s.charAt(i));
            longestTillNow=longestTillNow+s.charAt(i);

            if(longestTillNow.length()>longestOverall.length()){
                longestOverall = longestTillNow;
            }
        }

        System.out.println(longestOverall);
    }
}
