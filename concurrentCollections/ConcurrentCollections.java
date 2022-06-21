package com.concurrentCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ConcurrentHashMap<String,String> cityCode = new ConcurrentHashMap<String,String>();
       cityCode.put("Delhi", "India");
       cityCode.put("moscow","Russia");
       cityCode.put("New York","USA");
       
       Iterator iterator =cityCode.keySet().iterator();
       
       while(iterator.hasNext()) {
    	   System.out.println(cityCode.get(iterator.next()));
    	   cityCode.put("Istanbul", "Turkey");
       }
	}
}
