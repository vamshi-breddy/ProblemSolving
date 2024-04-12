package com.DSAlgo.Arrays.StockBuyandSell;

public class BuyAndSellStocks {

    //only update if the buyPrice if the currentPrice is lower
    //sell only if the currentPrice is greater than buyPrice
    //update the maxPrice when needed

    public static void main(String[] args) {
//        int a[] =new int[] {7,2,4,5,1,3,6,4};
//        int a[] =new int[] {7,6,4,3,1};
        int a[] = new int[]{100, 180, 260, 310, 40, 535, 695};
        int buyPrice, currentProfit = 0, maxProfit = 0;
        buyPrice = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < buyPrice) {
                buyPrice = a[i];
            } else if (a[i] > buyPrice) {
                currentProfit = Math.abs(buyPrice - a[i]);
                maxProfit = Math.max(currentProfit, maxProfit);
            }
        }
        System.out.println(maxProfit);
    }
}
