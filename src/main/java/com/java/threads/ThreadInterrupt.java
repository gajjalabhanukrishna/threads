package com.java.threads;

public class ThreadInterrupt implements Runnable {

    public void run() {
        for (int i = 1; i <= 5; i++) {

            System.out.println(i);

            try {
                System.out.println(Thread.currentThread().isInterrupted());
                Thread.sleep(2000);

                //continue;

            } catch (InterruptedException ex) {
                System.out.println("I'm interrupted");
            }
        }


    }
    public static void main(String args[]) {
        Runnable task = new ThreadInterrupt();
        Thread thread = new Thread(task);


        thread.start();

        try {
            Thread.sleep(5000);
            thread.interrupt();
            //Thread.currentThread().interrupt();
            System.out.println(Thread.currentThread().isInterrupted());

        } catch (InterruptedException ex) {
            System.out.println("I'm interrupted- in main");
        }
        System.out.println("The Main");
    }
}
