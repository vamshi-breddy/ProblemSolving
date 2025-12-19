package com.DSAlgo.LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "pwwkewxpw";
        System.out.println(findLongestSubstring(s));
    }

    private static int findLongestSubstring(String s) {
        int maxLen=0,right,left=0;
        HashSet<Character> characterHashSet = new HashSet<>();
        for(right=0;right<s.length();right++){

            while(characterHashSet.contains(s.charAt(right))){
                left++;
                characterHashSet.remove(s.charAt(left));
            }

            characterHashSet.add(s.charAt(right));
            maxLen=Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}
