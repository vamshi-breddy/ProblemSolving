package com.priorityQueue;

import java.util.PriorityQueue;

public class FindNumber {
	
	public static int getNumber(int n,int k, int a[]) {
		PriorityQueue<Integer> minHeap=new PriorityQueue<Integer>();
		for(int i=0;i<k;i++) {
			minHeap.add(a[i]);
		}
		for(int i=k;i<n;i++) {
			if(minHeap.peek()>a[i])
				continue;
			else {
				minHeap.poll(); //removes the top element
				minHeap.add(a[i]);
			}
		}
		return minHeap.peek();
		
	}

}
