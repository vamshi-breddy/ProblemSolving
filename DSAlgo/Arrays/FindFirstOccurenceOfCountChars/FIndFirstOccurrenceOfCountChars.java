package com.DSAlgo.Arrays.FindFirstOccurenceOfCountChars;

import java.util.HashMap;

public class FIndFirstOccurrenceOfCountChars {
    public static void main(String[] args) {
        String s = "sssaaabbvvccaassbbbnnnn";

        HashMap<Character,Integer> hm = new HashMap<>();

        int i=0;

        while(i<s.length()){

            int count =1;

            while(i+1<s.length() && s.charAt(i)==s.charAt(i+1)){
                count++;
                i++;
            }

            if(!hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),count);
            }
            i++;

        }

        hm.entrySet().stream().forEach(e->System.out.println(e.getKey()+" "+e.getValue()));




    }
}
