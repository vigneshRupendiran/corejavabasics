package com.corejava.threadsbasics;

public class YeildTest {
    public static void main(String[] args) {
        SeethaThread runnable = new SeethaThread();
        Thread seethaThread = new Thread(runnable,"High Priority-Rescue Seetha Task");

        RamaThread ramaThread = new RamaThread();
        try {
            for (int i = 1; i < 5; i++) {
                System.out.println("Main Thread is Sleeping 3 seconds");
                Thread.sleep(10000);
                Thread.yield();
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        seethaThread.start();
        ramaThread.start();

    }

}

class SeethaThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
            System.out.println("Seetha is running times "+i);
        }
    }
}

class RamaThread extends Thread{
    @Override
    public void run() {
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        Thread.currentThread().setName("Low Priority - Rama Task");
        for (int i = 0; i < 10; i++) {
            System.out.println("Rama is running time "+i);
        }
    }
}
