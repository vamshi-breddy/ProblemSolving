package com.DSAlgo.CogInterview.MaxNumberInListJava8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxNumberInListJava8 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,9,2,8,6,5);

        Integer maxNumber = numbers.stream().max(Comparator.naturalOrder()).get();

        System.out.println(maxNumber);
    }
}
