package com.CoreJava.customImmutableClass;

import java.util.ArrayList;
import java.util.List;

public class ImmutableDemo {
    public static void main(String[] args) {
        List<String> subList = new ArrayList<>();
        subList.add("HTML");
        subList.add("CSS");
        Student s1 = new Student(101,"SWAMI",subList);
        System.out.println(s1);

        s1.getSubject().add("C++");
        s1.getSubject().add("Node");

        System.out.println(s1);
    }
}
