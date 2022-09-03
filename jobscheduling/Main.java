package com.jobscheduling;

public class Main {

    public static void main(String[] args) {
       JobScheduler[] arr = new JobScheduler[4];
       arr[0] = new JobScheduler(1,4,20);
       arr[1] = new JobScheduler(2,1,10);
       arr[2] = new JobScheduler(3,2,40);
       arr[3] = new JobScheduler(4,2,30);

       Solve ob = new Solve();
       int[] res=ob.jobScheduling(arr,4);
        System.out.println(res[0]+ "  "+res[1]);
    }
}
