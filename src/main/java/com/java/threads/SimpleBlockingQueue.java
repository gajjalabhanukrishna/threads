package com.java.threads;

public class SimpleBlockingQueue {
    Object[] items = new Object[100];
    int count, putPointer, takePointer;
    private boolean closed = false;

    public synchronized void put(Object x) throws InterruptedException{
        while(count == items.length){
            wait();
        }
        items[putPointer] = x;

        if(++putPointer == items.length){
            putPointer = 0;
        }

        count++;
        notifyAll();
    }

    public synchronized Object take() throws InterruptedException {

        while(count == 0 || items.length == 0){
            wait();
        }
        Object x = items[takePointer];
        if(++takePointer == items.length){
            takePointer = 0;
        }
        count--;
        notifyAll();
        return x;

    }

    public synchronized boolean isClosed() {
        return closed;
    }

    public synchronized void setClosed(boolean closed) {
        this.closed = closed;
    }
}
