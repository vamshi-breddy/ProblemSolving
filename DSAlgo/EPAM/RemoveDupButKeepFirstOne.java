package com.DSAlgo.EPAM;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveDupButKeepFirstOne {
    public static void main(String[] args) {
        String s = "AaaBbbCD";

        String result = s.chars().mapToObj(c->(char)c).map(String::valueOf)
                .collect(Collectors.toMap(String::toLowerCase, Function.identity()
        ,(first,second)->first, LinkedHashMap::new)).values().stream().collect(Collectors.joining());

        System.out.println(result);
    }
}
