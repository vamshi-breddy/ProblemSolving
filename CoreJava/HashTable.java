package com.CoreJava;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTable {
    public static void main(String[] args) {
        Hashtable<String,String> ht = new Hashtable();
        ht.put(new String("1"),"one");
        ht.put("1","three");
        ht.put("2",ht.put(new String("2"),"two"));

        Enumeration<String> keys = ht.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            System.out.println("Key: " + key + ", Value: " + ht.get(key));
        }

    }
}
