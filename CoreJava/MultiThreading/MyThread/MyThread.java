package com.CoreJava.MultiThreading.MyThread;

public class MyThread extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            Thread.yield();
            System.out.println("Thread started: " +Thread.currentThread().getName());
            
        }

        System.out.println("Thread ended: " +Thread.currentThread().getName());
    }
}
