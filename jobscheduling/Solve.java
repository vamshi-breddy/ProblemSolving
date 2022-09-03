package com.jobscheduling;

import java.util.Arrays;

class Solve {

    int[] jobScheduling(JobScheduler arr[],int n) {
        Arrays.sort(arr, (a, b) -> (b.profit - a.profit));
        int maxi = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i].deadline > maxi) {
                maxi = arr[i].deadline;
            }
        }
        int result[] = new int[maxi + 1];

        for (int i = 0; i <= maxi; i++) {
            result[i] = -1;
        }
        int countJobs = 0, jobProfits = 0;
        for (int i = 0; i < n; i++){
            for (int j = arr[i].deadline; j > 0; j--) {
                if (result[j] == -1) {
                    result[j] = i;
                    countJobs++;
                    jobProfits = jobProfits + arr[i].profit;
                    break;
                }
            }
        }
        int ans[] = new int[2];
        ans[0] = countJobs;
        ans[1] = jobProfits;
        return ans;
    }

}
