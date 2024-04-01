package com.DSAlgo.AnagramsTogether;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class AnagramsTogether {
    public static void main(String[] args) {
        HashMap<String, List<String>> hashMap = new HashMap<>();
        String a[]= new String[]{"cat","dog","tac","god","act"};

        for(int i = 0; i < a.length; i++){
            String word = a[i];
            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            String newWord = new String(letters);
            if(hashMap.containsKey(newWord)){
                hashMap.get(newWord).add(word);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(word);
                hashMap.put(newWord,list);
            }
        }
        for(String s : hashMap.keySet()){
            List<String> list = hashMap.get(s);
            if(list.size() > 1){
                System.out.println(list);
            }
        }
    }
}
