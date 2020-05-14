package com.java.threads;

public class BQConsumer implements Runnable {
    private final SimpleBlockingQueue queue;

    BQConsumer(SimpleBlockingQueue q) {
        queue = q;
    }

    public void run() {
        try {
            while (!queue.isClosed()) {
                consume((SquareTask) queue.take());
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    private void consume(SquareTask x) {
        System.out.println(x.execute());
    }
}
