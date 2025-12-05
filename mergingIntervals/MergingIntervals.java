package com.mergingIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergingIntervals {
    public static void main(String[] args) {
        int[][] a;
        a = new int[][]{{1,3},{2,6},{8,10},{15,18}};
        int[][] res = mergeInput(a);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static int[][] mergeInput(int[][] intervals) {

        Arrays.sort(intervals, Comparator.comparing(i->i[0]));

        List<int[]> result = new ArrayList<>();

        int[] newInterval = intervals[0];
        result.add(newInterval);

        for (int[] interval:intervals){
            if (interval[0]<=newInterval[1]){
                newInterval[1] = Math.max(newInterval[1],interval[1]);
            }
            else {
                newInterval = interval;
                result.add(newInterval);
            }
        }

        return result.toArray(new int[result.size()][]);


    }
}
