package com.corejava.threadsbasics;

//Case 4: Overloading of run() is possible in Thread?

/***
 * 1.Overloading run() method is always possible in thread,But Thread always calls the no-arguments run() method only
 * 2. if argumented run method {run(int value)} is considred as a normal method, that we have to call explicitly.
 */
public class Case4 {
    public static void main(String[] args) {
        MyThread4 thread4 = new MyThread4();
        thread4.start();

        thread4.run(10);// have to call explicitly,like a normal method

        for (int loopmain = 1; loopmain <= 5; loopmain++) {
            System.out.println(" This is Main Thread : "+loopmain);
        }
    }
}

class MyThread4 extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <=5 ; i++) {
            System.out.println(" the Child Thread : "+i);
        }
    }

    public void run(int value){
        for (int i = 1; i <=value ; i++) {
            System.out.println(" the normal method : "+i);
        }
    }
}
