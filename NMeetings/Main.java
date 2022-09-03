package com.NMeetings;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        int n =6;
        int start[] = {1,0,3,8,5,8};
        int end[] = {2,6,4,9,7,9};
        maxMeetings(start,end,n);
    }

    private static void maxMeetings(int[] start, int[] end, int n) {
        ArrayList<Meeting> meet = new ArrayList<>();
        for (int i = 0; i < start.length; i++) {
            meet.add(new Meeting(start[i],end[i],i+1));
        }
        meetingComparator mc = new meetingComparator();
        Collections.sort(meet,mc);
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(meet.get(0).pos);
        int limit = meet.get(0).end;

        for (int i = 1; i < start.length; i++) {
              if(limit<meet.get(i).start){
                  limit = meet.get(i).end;
                  answer.add(meet.get(i).pos);
              }
        }
        for (int i = 0; i < answer.size(); i++) {
            System.out.println("The order of meetings perfomed "+ answer.get(i));
        }
    }
}
