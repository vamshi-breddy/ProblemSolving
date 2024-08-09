package com.DSAlgo.HashMapImplementation;

import java.util.HashMap;
import java.util.Map;

public class CustomObjectAsKeyHashMap {
    public static void main(String[] args) {

        //s1, s2, s3 are stored in different location and different hashcodes are generated
        Student s1 = new Student(101,"Vamshi");
        Student s2 = new Student(101,"Vamshi");
        Student s3 = new Student(101,"Vamshi");

        HashMap<Student,String> hm = new HashMap<>();

        hm.put(s1,"Student-1");
        hm.put(s2,"Student-2");
        hm.put(s3,"Student-3");

        for(Map.Entry< Student,String> entry:hm.entrySet()){
            System.out.println(entry.getKey()+"======="+entry.getValue());
        }

        s3.setStudId(105);
        System.out.println(hm.get(s3));
    }
}
