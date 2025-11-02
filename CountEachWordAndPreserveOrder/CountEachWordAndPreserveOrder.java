package com.CountEachWordAndPreserveOrder;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountEachWordAndPreserveOrder {
    public static void main(String[] args) {
        List<String> sentences = Arrays.asList("Java is powerful and versatile","Java is widely used",
                "Powerful tools make Java development easier");

        sentences.stream().flatMap(sentence -> Arrays.stream(sentence.split("\\s+"))).map(s->s.toLowerCase())
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream()
                .forEach(e-> System.out.println(e.getKey()+" "+e.getValue()));

    }
}
