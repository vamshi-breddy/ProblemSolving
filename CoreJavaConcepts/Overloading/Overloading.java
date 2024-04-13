package com.CoreJavaConcepts.Overloading;

public class Overloading {
    public static void main(String[] args) {
        methodCall(12);
    }

    private static void methodCall(Integer i) {
        System.out.println("Print Integer");
    }

    private static void methodCall(short i) {
        System.out.println("Print String");
    }

    private static void methodCall(Long i) {
        System.out.println("Print Long");
    }
}
