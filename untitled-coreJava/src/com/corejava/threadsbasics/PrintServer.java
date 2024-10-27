package com.corejava.threadsbasics;

public class PrintServer {
    public static void main(String[] args) {
        Thread highPriorityThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Processing critical print job " + i);
                // Simulate some work with sleep
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        highPriorityThread.setPriority(Thread.MAX_PRIORITY);

        Thread lowPriorityThread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Processing regular print job " + i);
                // Simulate some work with sleep
                try {
                    Thread.sleep(1500);
                    // Yield to allow high priority thread to run
                    Thread.yield();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        lowPriorityThread.setPriority(Thread.MIN_PRIORITY);

        // Start both threads
        highPriorityThread.start();
        lowPriorityThread.start();
    }
}

