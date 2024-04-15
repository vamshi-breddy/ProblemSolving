package com.CoreJava.ArrayListMethods;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {
    public static void main(String[] args) {
        int[] array = {3,6,9,5};
        List<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(array[0]);
        arrayList.add(array[2]);
        arrayList.set(1,array[0]);
        arrayList.set(1,array[1]);
        arrayList.remove(0);
        arrayList.add(array[0]);
        System.out.println(arrayList);
    }
}
