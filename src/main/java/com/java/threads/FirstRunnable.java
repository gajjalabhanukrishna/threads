package com.java.threads;

public class FirstRunnable implements Runnable{
    public void run() {
        System.out.println("My name is: " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("My name is: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) throws InterruptedException {
        Runnable task = new FirstRunnable();
        Thread t2 = new Thread(task);
        t2.start();
        //t2.join();

        System.out.println("My name is: " + Thread.currentThread().getName());
    }

}
