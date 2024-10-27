package com.corejava.threadsbasics;

public class PrintServerWithJoin {
    public static void main(String[] args) {
        Thread highPriorityThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Processing critical print job " + i);
                try {
                    Thread.sleep(500); // Simulate some work with sleep
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        highPriorityThread.setPriority(Thread.MAX_PRIORITY);

        Thread lowPriorityThread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Processing regular print job " + i);
                try {
                    Thread.sleep(500); // Simulate some work with sleep
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        lowPriorityThread.setPriority(Thread.MIN_PRIORITY);

        // Start the high priority thread
        highPriorityThread.start();

        // Use join() to wait for high priority thread to complete
        try {
            highPriorityThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Start the low priority thread only after the high priority thread finishes
        lowPriorityThread.start();
    }
}

