package com.DSAlgo.EPAM;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicatesInaString {
    public static void main(String[] args) {
        String s ="The geeks for geeks is an awesome platform for students to learn";

        System.out.println(Arrays.stream(s.split(" ")).distinct().collect(Collectors.joining(" ")));

    }
}
