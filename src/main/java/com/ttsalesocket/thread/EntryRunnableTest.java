package com.ttsalesocket.thread;

public class EntryRunnableTest {
    public static void main(String[] args) {
        System.out.println("Main thread running... ");

        Thread threadHieu = new Thread(new RunnableTest("Thread HIEU "));
        threadHieu.start();

        Thread threadAnh = new Thread(new RunnableTest("Thread ANH "));
        threadAnh.start();

        System.out.println("==> Main thread stopped!!! ");
    }
}
