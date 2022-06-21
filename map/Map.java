package com.map;

import java.util.HashMap;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HashMap<String, String> hm=new HashMap<String,String>();
      hm.put("A", "Angular");
      hm.put("J","Java");
      hm.put("S","SCALA");
      
      for(HashMap.Entry<String,String> lang:hm.entrySet()) {
    	  System.out.println(lang.getKey()+"="+lang.getValue());
      }
	}

}
