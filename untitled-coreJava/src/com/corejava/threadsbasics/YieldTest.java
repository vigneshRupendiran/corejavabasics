package com.corejava.threadsbasics;

public class YieldTest {
    public static void main(String[] args) throws InterruptedException {
        //type 1
        Thread high = new Thread(()->{
            {
                for (int i = 0; i < 5; i++) {
                    try {
                        Thread.sleep(1000);
                        System.out.println("HighPriority Task :"+i);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        high.setPriority(Thread.MAX_PRIORITY);
        high.start();

        //type 2
        LowPriorityTask lowPriorityTask = new LowPriorityTask();
        Thread low = new Thread(lowPriorityTask);
        low.setPriority(Thread.MIN_PRIORITY);

        for (int i = 0; i < 5; i++) {
                System.out.println("Main Task :"+i);
            Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
            Thread.yield();
            Thread.sleep(3000);
        }
        //low.start();
    }
}


class LowPriorityTask extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("LOW Priority Task :"+i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
