package com.reverse;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Geeks for Geeks";
		ReverseString rev=new ReverseString();
		System.out.println(rev.reverse(str));
	}

	private String reverse(String str) {
		// TODO Auto-generated method stub
        if ((str==null)||(str.length() <= 1))
        {
            return str;   
        }
        	  return reverse(str.substring(1))+str.charAt(0);
         
     }

	}


