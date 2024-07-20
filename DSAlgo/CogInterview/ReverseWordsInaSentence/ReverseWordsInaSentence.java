package com.DSAlgo.CogInterview.ReverseWordsInaSentence;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWordsInaSentence {
    public static void main(String[] args) {
        String str = "Hello World from Java";

        System.out.println(Arrays.stream(str.split("\\s"))
                .map(word -> new StringBuilder(word).reverse().toString()).collect(Collectors.joining(" ")));

    }
}
