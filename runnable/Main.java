package com.runnable;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Runnable r=new MyRunnable();
       Thread t=new Thread(r);
       t.start();
       for(int i=0;i<5;i++) {
    	   System.out.println("main thread");
       }
	}

}
