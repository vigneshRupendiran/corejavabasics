package com.corejava.threadsbasics;

//case 6: what happen if we override the start() method and call the super.start().

/**
 * 1.if we override the start() and call the super.start().
 * 2.it will call Thread class start() method. so Child Thread will be created.
 * 3.output will be diff for every re-run
 * 4.Thread-Scheduler will handle the Thread operations.
 */

public class Case7 {
    public static void main(String[] args) {
        MyThreadCase7 thread = new MyThreadCase7();
        thread.start();


            System.out.println(" This is Main Thread ** ");

    }
}

class MyThreadCase7 extends Thread{
    @Override
    public void start() {
        super.start(); //it will call Thread class start() method. so Child Thread will be created.

            System.out.println(" This is start method -- ");

    }

    @Override
    public void run(){

            System.out.println(" This is run method == ");

    }
}

