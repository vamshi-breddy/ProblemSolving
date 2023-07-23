package com.FrequencyOfWordInaSentence;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfWordInaSentence {

    public static void main(String[] args){
        String str = "Fear leads to anger, anger leads to hatred, hatred leads to conflict, conflict leads to suffering";
        Map<String,Long> frequency = Arrays.stream(str.split("\\s+"))
                .map(word -> word.replaceAll("[^a-zA-Z]","").toLowerCase())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(frequency);
    }
}
