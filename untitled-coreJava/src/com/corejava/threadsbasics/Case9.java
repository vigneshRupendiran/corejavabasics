package com.corejava.threadsbasics;

//case 8 is Lifecycle of THREAD

//case :9 what if we call the same object start() twice or more times?

/**
 * 1.No error at compile-time
 * 2.Error will throw at runtime
 * 3.error : IllegalThreadStateException
 */
public class Case9 {
    public static void main(String[] args) {
        System.out.println(" This is main method == ");

        MyThreadCase8 myThreadCase8 = new MyThreadCase8();
        myThreadCase8.start();//1

        System.out.println(" This is main method 2 ");

        myThreadCase8.start();//2
        myThreadCase8.start();//3
        myThreadCase8.start();//4
    }
}

class MyThreadCase8 extends Thread{

    @Override
    public void run(){
        System.out.println(" This is child run method == ");
    }
}

