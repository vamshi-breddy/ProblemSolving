package com.CoreJava.MultiThreading.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        for (int i=0;i<5;i++){
            System.out.println("Thread started:" +Thread.currentThread().getName());
        }
        System.out.println("Thread ended:" +Thread.currentThread().getName());
    }
}
