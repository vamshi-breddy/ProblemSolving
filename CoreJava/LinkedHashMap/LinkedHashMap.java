package com.CoreJava.LinkedHashMap;

import java.util.Map;

public class LinkedHashMap {
    public static void main(String[] args) {
        //LinkedHashMap preserves order used in LRU
        Map<String,Integer> scores = new java.util.LinkedHashMap<>();
        scores.put("Alice", 85);
        scores.put("Bob", 95);
        scores.put("Charlie", 80);

        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println("Student: " + entry.getKey() + ", Score: " + entry.getValue());
        }
    }
}
