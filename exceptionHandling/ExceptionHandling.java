package com.exceptionHandling;

public class ExceptionHandling {

	@SuppressWarnings("finally")
	public static int main(String[] args) {
		// TODO Auto-generated method stub
        	try {
        		int c=10/0;
        	    return 1;
        	}
        	catch(Exception e) {
        		e.printStackTrace();
        	}
        	finally {
        		return 5;
        	}
        }
	}
