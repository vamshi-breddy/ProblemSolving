package com.weekDaysSorting;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class WeekdaysComparator implements Comparator<String> {

	private Map<String,Integer> weekMap;
	
	WeekdaysComparator(){
		weekMap = new HashMap<>();
		weekMap.put("SUNDAY",0);
		weekMap.put("MONDAY",1);
		weekMap.put("TUESDAY",2);
		weekMap.put("WEDNESDAY",3);
		weekMap.put("THURSDAY", 4);
		weekMap.put("FRIDAY", 5);
		weekMap.put("SATURDAY", 6);	
	}
	
	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return weekMap.get(o1).compareTo(weekMap.get(o2));
	}

}
