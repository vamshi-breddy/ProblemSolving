package com.DSAlgo.CHUBB;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "aaryanna",
                "aayanna",
                "airianna",
                "alassandra",
                "allanna",
                "allannah",
                "allessandra",
                "allianna",
                "allyanna",
                "anastaisa",
                "anastashia",
                "anastasia",
                "annabella",
                "annabelle",
                "annebelle"
        );

        names.stream()
                .filter(FilterAndMapper.Filter.nameStartingWithPrefix(scanner.nextLine()))
                .map(FilterAndMapper.Mapper.getDistinctCharactersCount())
                .forEachOrdered(System.out::println);
    }
}
