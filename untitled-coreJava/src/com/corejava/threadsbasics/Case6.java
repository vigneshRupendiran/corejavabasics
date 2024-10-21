package com.corejava.threadsbasics;

//case 6: what happen if we override the start() method

/**
 * 1.If we override the start() method,The THREAD class start() will not be executed, which is responsbile to create a thread.
 * 2.So the Child THREAD won't be created.
 * 3.the run() will not be initiated.
 * 4.the start() will act as a normal method call.
 * 5.ouput is always same for everytime running which was executed by only MAIN THREAD.
 */
public class Case6 {
    public static void main(String[] args) {
        MyThreadCase6 thread6 = new MyThreadCase6();
        thread6.start();

        for (int loopmain = 1; loopmain <= 5; loopmain++) {
            System.out.println(" This is Main Thread : "+loopmain);
        }
    }
}

class MyThreadCase6 extends Thread{
//start() will acts a normal method, if we overrided here
    @Override
    public void start() {
        for (int loop = 1; loop <= 5; loop++) {
            System.out.println(" This is start method == "+loop);
        }
    }

    @Override
    public void run(){
        for (int loop = 1; loop <= 5; loop++) {
            System.out.println(" This is run method == "+loop);
        }
    }
}