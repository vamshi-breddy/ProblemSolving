package com.parallelStream;

import java.util.Arrays;
import java.util.List;

public class ParallelStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<String> list=Arrays.asList("Hello","G","E","E","K","S");
       
       list.stream().forEach(e ->System.out.println(e));
       System.out.println();
       list.parallelStream().forEach(e-> System.out.println(e));
	}
}
