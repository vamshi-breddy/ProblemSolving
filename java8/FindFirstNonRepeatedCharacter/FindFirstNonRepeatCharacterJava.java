package com.java8.FindFirstNonRepeatedCharacter;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FindFirstNonRepeatCharacterJava {
    public static void main(String[] args) {
        String input ="geeksforgeeks";
        findFirstNonRepeatedCharacters(input);
    }

    private static void findFirstNonRepeatedCharacters(String input) {
        char[] c = input.toCharArray();
        HashMap<Character,Integer> hashMap = new LinkedHashMap<>();
        for (int i = 0; i < c.length; i++) {
            if(hashMap.containsKey(c[i])){
                hashMap.put(c[i],hashMap.get(c[i])+1);
            }
            else {
                hashMap.put(c[i],1);
            }
        }

        System.out.println(hashMap.entrySet().stream().filter(entry -> entry.getValue() == 1).findFirst().get().getKey());
    }
}
