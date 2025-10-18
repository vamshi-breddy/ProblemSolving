package com.DSAlgo.EPAM;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class SortBasedOnCharacter {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple","Banana","Avocado","Cherry","blueBerry");
        sortOnCharacter(list);
    }

    private static void sortOnCharacter(List<String> list) {
        TreeMap<Character, List<String>> collect = list.stream().
                collect(Collectors.groupingBy(s -> s.toLowerCase().charAt(0), TreeMap::new, Collectors.toList()));
        System.out.println(collect);
    }
}
