package com.stringmanipulation;

import java.util.ArrayList;
import java.util.List;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="vamshi reddy";  
		s=s.replaceAll("\\s+","");
		//v@msh@ r@ddy

		char[] c= s.toCharArray();
		int len = c.length;
		String str = "";
		for(int i=0;i<len;i++){
		if((c[i]=='a' | c[i]=='e' | c[i]=='i' | c[i]=='o'| c[i]=='u') && i%2!=0)
		{
		str+="@";
		}
		else{
		str+=c[i];
		}

		}
		System.out.println(str);
	}

}
