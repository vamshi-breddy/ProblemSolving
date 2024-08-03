package com.DSAlgo.EPAM;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaxInaSentence {
    public static void main(String[] args) {
        String str = "START MAN MID MAN goodbye mAN welcome Man Hi There maN BYE bye MaN";

        HashMap<String,Integer> hm = new HashMap<>();

        Arrays.stream(str.toLowerCase().split("\\s+")).forEach(e->hm.put(e,hm.getOrDefault(e,0)+1));

        System.out.println(hm);

        System.out.println(hm.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey());

    }
}
