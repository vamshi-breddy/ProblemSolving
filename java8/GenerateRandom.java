package com.java8;

import java.util.Random;

public class GenerateRandom {
    public static void main(String[] args) {
        Random random = new Random();
        random.ints(1,20).limit(10).forEach(System.out::println);
    }
}
