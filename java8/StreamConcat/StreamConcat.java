package com.java8.StreamConcat;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamConcat {

    public static void main(String[] args) {

        List<Integer> num = List.of(1,-1,3,46,7,0,6,0,45,0,0);

        List<Integer> collect = Stream.concat(num.stream().filter(x -> x != 0), num.stream().filter(x -> x == 0))
                .collect(Collectors.toList());

        collect.stream().forEach(e-> System.out.print(e+" "));


    }
}
