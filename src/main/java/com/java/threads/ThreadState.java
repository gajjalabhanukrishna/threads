package com.java.threads;

public class ThreadState {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Runnable() {
            public void run() {

                Thread self = Thread.currentThread();
                System.out.println(self.getName() + "is " + self.getState());// LINE 0
            }
        });

        System.out.println(t.getName() + "is " + t.getState()); // LINE 1

        t.start();
        //Thread.currentThread().join();
        System.out.println(t.getName() + "is " + t.getState()); // LINE 2

        System.out.println(Thread.currentThread().getName() + "is " + Thread.currentThread().getState());
        //Thread.currentThread().join();
            t.join();
        if (t.getState() == Thread.State.TERMINATED) {
            System.out.println(t.getName() + " is terminated"); // LINE 3
        }
    }
}
