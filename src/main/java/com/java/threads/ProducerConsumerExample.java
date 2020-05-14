package com.java.threads;

public class ProducerConsumerExample {
    public static void main(String[] args) throws InterruptedException {
//        Drop drop = new Drop();
//        (new Thread(new Producer(drop))).start();
//        (new Thread(new Consumer(drop))).start();

        SimpleBlockingQueue boundedBuffer = new SimpleBlockingQueue();
        BQProducer p = new BQProducer(boundedBuffer);
        BQConsumer c1 = new BQConsumer(boundedBuffer);
        BQConsumer c2 = new BQConsumer(boundedBuffer);
        new Thread(p).start();
        new Thread(c1).start();
        new Thread(c2).start();
        Thread.sleep(100);
        boundedBuffer.setClosed(true);
    }
}
