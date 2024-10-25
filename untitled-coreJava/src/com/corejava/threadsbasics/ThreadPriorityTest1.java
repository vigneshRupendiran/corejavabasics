package com.corejava.threadsbasics;

public class ThreadPriorityTest1 {
    public static void main(String[] args) {
        MyThreadCustom1 myThreadCustom1 = new MyThreadCustom1();
        myThreadCustom1.setPriority(Thread.MIN_PRIORITY);
        myThreadCustom1.setName("myThreadCustom1");
        myThreadCustom1.start();

        ThreadPriority2 threadPriority2 = new ThreadPriority2();
        System.out.println(Thread.currentThread().getName());

    }
}

class MyThreadCustom1 extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

class ThreadPriority2{
    ThreadPriority2(){
        MyThreadCustom1 myThreadCustom2 = new MyThreadCustom1();
        myThreadCustom2.setPriority(Thread.MAX_PRIORITY);
        myThreadCustom2.setName("myThreadCustom2");
        myThreadCustom2.start();
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("MyCustomThread-3");
        System.out.println(Thread.currentThread().getName());
    }
}