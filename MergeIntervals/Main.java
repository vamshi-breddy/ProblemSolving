package com.MergeIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        ArrayList<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(new Integer[] {1,3}));//0
        arr.add(Arrays.asList(new Integer[]{2,4}));//1
        arr.add(Arrays.asList(new Integer[]{2,6}));//2
        arr.add(Arrays.asList(new Integer[]{8,9}));//3
        arr.add(Arrays.asList(new Integer[]{8,10}));//4
        arr.add(Arrays.asList(new Integer[]{9,11}));//5
        arr.add(Arrays.asList(new Integer[]{15,18}));//6
        arr.add(Arrays.asList(new Integer[]{16,17}));//7
        ArrayList < List < Integer >> ans = merge(arr);
        System.out.println("Merged Overlapping Intervals are ");
        for (List < Integer > it: ans) {
            System.out.println(it.get(0) + " " + it.get(1));
        }
    }

    static ArrayList<List<Integer>> merge(ArrayList<List<Integer>> intervals) {

        Collections.sort(intervals, (a, b) -> a.get(0) - b.get(0));
        ArrayList<List<Integer>> merged = new ArrayList<>();
        System.out.println(intervals+"intervals");
        System.out.println(merged+"[[");
//        System.out.println(merged.get(merged.size() - 1).get(1));

        for (int i = 0; i < intervals.size(); i++) {
            if (merged.isEmpty() || merged.get(merged.size() - 1).get(1) < intervals.get(i).get(0)) {
                ArrayList<Integer> v = new ArrayList<>();
                v.add(intervals.get(i).get(0));
                System.out.println(intervals.get(i).get(0)+"zero");
                v.add(intervals.get(i).get(1));
                System.out.println(intervals.get(i).get(1)+"1");

                merged.add(v);
            } else {
                merged.get(merged.size() - 1).set(1, Math.max(merged.get(merged.size() - 1).get(1), intervals.get(i).get(1)));
            }
        }

        return merged;
    }
}


