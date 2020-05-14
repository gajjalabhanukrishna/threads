package com.java.threads;

public class SquareTask {

    private int threadNumb;

    public SquareTask(int threadNumb){
        this.threadNumb = threadNumb;
    }

    public int execute(){
        return threadNumb;
    }
}
