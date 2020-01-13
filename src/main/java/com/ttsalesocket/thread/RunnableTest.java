package com.ttsalesocket.thread;

import java.util.concurrent.TimeUnit;

public class RunnableTest implements Runnable{

    String threadName ;

    public RunnableTest (String threadName){
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println("Running " + threadName);
        for (int i = 0; i < 3; i++){
            System.out.println(threadName + " -- " + i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread " + threadName + " quiting.");
    }
}
