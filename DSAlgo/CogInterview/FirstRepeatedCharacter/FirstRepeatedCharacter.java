package com.DSAlgo.CogInterview.FirstRepeatedCharacter;

import java.util.HashSet;

public class FirstRepeatedCharacter {
    public static void main(String[] args) {
        String s = "Interview";

        HashSet<Character> set = new HashSet<>();

        System.out.println(s.chars().mapToObj(c -> (char) c).filter(c -> !set.add(c)).findFirst().orElse('\0'));
    }
}
