package com.infosysInterview;

import java.util.ArrayList;
import java.util.List;

public class StringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<String> sList = new ArrayList<String>();
     sList.add("");
     for(String s:sList) {
    	 System.out.println(s.length());
     }
     
     sList.add(null);
     
     for(String s:sList) {
    	 System.out.println(s.length());
     }
	}

}
