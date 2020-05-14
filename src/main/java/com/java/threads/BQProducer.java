package com.java.threads;

import java.util.concurrent.ThreadLocalRandom;

public class BQProducer implements Runnable {
    private final SimpleBlockingQueue queue;

    BQProducer(SimpleBlockingQueue q) {
        queue = q;
    }

    public void run() {
        try {
            while (!queue.isClosed()) {
                queue.put(produce());
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    private SquareTask produce() {
        return new SquareTask(ThreadLocalRandom.current().nextInt(1, 200));
    }
}
