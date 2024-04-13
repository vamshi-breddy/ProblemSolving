package com.java8.FindFirstNonRepeatedCharacter;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class FindFirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String s = "Interview";
        char firstNonRepeated=findFirstNonRepeatedCharacter(s);
        System.out.println(firstNonRepeated);

    }

    private static char findFirstNonRepeatedCharacter(String s) {
        Map<Character,Integer> charCountMap = new LinkedHashMap<>();
        s.toLowerCase().chars().mapToObj(c->(char)c).forEach(c->charCountMap.put(c,charCountMap.getOrDefault(c,0)+1));
        System.out.println(charCountMap);

        Optional<Character> firstNonRepeatedCharacter=charCountMap.entrySet().stream().filter(entry->entry.getValue()==1).map(Map.Entry::getKey).findFirst();

        return firstNonRepeatedCharacter.orElseThrow(()->new RuntimeException("No non-repeated Character found"));
    }
}
