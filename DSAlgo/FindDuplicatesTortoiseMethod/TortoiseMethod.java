package com.DSAlgo.FindDuplicatesTortoiseMethod;

public class TortoiseMethod {
    public static void main(String[] args) {
        int nums[] = new int[] {2,6,4,1,3,1,5};
        int slow=nums[0],fast=nums[0];
        do{
             slow=nums[slow];
             fast=nums[nums[fast]];
        }
        while (slow!=fast);

        fast=nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        System.out.println(slow);
    }
}
