package com.DSAlgo.GreedyAlgorithms;

import java.util.Comparator;

public class ItemComparator implements Comparator<Item> {

    @Override
    public int compare(Item o1, Item o2) {
        double r1 = (double) (o1.value)/(double) (o1.weight);
        double r2 = (double) (o2.value) /(double)(o2.weight);

        if (r1 < r2) {
             return 1;
        } else if (r1>r2) {
            return -1;
        }
        return 0;
    }
}
