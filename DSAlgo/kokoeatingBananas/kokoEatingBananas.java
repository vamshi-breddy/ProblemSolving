package com.DSAlgo.kokoeatingBananas;

public class kokoEatingBananas {
    public static void main(String[] args) {
        int piles[] = new int[]{3,6,7,11};
        int h=8;
        System.out.println(minimumRateToEatBananas(piles,h));


    }

    private static int minimumRateToEatBananas(int[] piles, int h) {
        int high = findMax(piles);
        int low=0;
        while(low<=high){
            int mid = low+(high-low)/2;
            int totalH = calculateHours(mid,piles);

            if(totalH<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
       return low;
    }

    private static int calculateHours(int mid,int[] piles) {
        int totalH =0;
        for (int i = 0; i < piles.length; i++) {
             totalH  = (int) (totalH+Math.ceil((double)(piles[i])/(double)(mid)));
        }
        return totalH;
    }

    private static int findMax(int[] piles) {
        int max = piles[0];
        for(int i=0;i<piles.length;i++){
            max = Math.max(piles[i],max);
        }
        return max;
    }
}
