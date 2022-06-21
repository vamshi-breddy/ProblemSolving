package com.evenandaveraging;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class evenaveraging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
         
         Double list1=list.stream().filter(x->x%2==0).map(p-> p=(int) Math.pow(p, 2))
        		 .collect(Collectors.averagingDouble(p->p));
         
         System.out.println(list1);
	}

}
