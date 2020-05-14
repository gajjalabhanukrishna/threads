package com.java.threads;

public class FirstThread  extends Thread{
    public void run(){
        System.out.println("My name is : " + getName());
    }

    public static void main(String[] args) {
        FirstThread f = new FirstThread();
        f.start();

        System.out.println("My name is : " + Thread.currentThread().getName());
    }
}
