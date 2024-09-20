package com.DSAlgo.Arrays;

public class MonotonicOrNot {
        public static void main(String[] args) {

            int a[] = new int[]{9,8,7,6,5};
            //int a[] = new int[]{1,4,6,7,9,9};

            int count1=0;
            int count2=0;
            for(int i=0;i<a.length-1;i++){

                if(a[i]<=a[i+1])
                {
                    count1++;
                }
                else if(a[i]>=a[i+1]){
                    count2++;
                }


            }

            if(count1==a.length-1 || count2 ==a.length-1){
                System.out.println("monotonic");
            }
            else{
                System.out.println("not monotonic");
            }

        }
    }

