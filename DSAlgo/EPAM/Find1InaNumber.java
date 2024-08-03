package com.DSAlgo.EPAM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find1InaNumber {
    public static void main(String[] args) {

        List<Integer> numberList = Arrays.asList(1,51,2124,614,2213456);
        List<Integer> resultList = new ArrayList<>();

        for(int i =0;i<numberList.size();i++){
            int n = numberList.get(i);

            if(n>=10){
                int sum =0;
                while(n>0){
                    int r = n%10;
                    sum = sum*10+r;
                    n=n/10;
                }
                int secondDigit = sum/10;
                int result = secondDigit%10;

                if(result==1){
                    resultList.add(i);
                }
            }
        }
        System.out.println(resultList);
    }
}
