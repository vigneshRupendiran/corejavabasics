package com.corejava.threadsbasics;

//Case 5: if we are not overriding the run() method what will happen?

/**
 * 1.if we are not overriding the run() method,Then Thread class run() method will be executed.
 * 2.The Thread class run() has only empty implementation, so there is no output for that thread call.
 * 3.so it is a bad practise of thread concept.
 */
public class Case5 {
    public static void main(String[] args) {
        MyThread5 thread5 = new MyThread5();
        thread5.start();

        for (int loopmain = 1; loopmain <= 5; loopmain++) {
            System.out.println(" This is Main Thread : "+loopmain);
        }
    }
}

class MyThread5 extends Thread{
    }
