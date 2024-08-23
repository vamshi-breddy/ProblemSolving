package com.DSAlgo.EPAM;

import java.util.List;
import java.util.stream.Collectors;

public class RemoveSubstringff {
    public static void main(String[] args) {
        List<String> list = List.of("Vamshiff","java","python","intellijff");

        System.out.println(list.stream().filter(s -> !s.contains("ff")).collect(Collectors.toList()));
    }
}
