package com.corejava.threadsbasics;

//Case 1: ThreadScheduler

/***
 * 1.There is various possible outputs of this program
 * 2.the outputs diffs at every time while re-running the program
 * 3.In this program 4 types of the outputs will be generated
 * 4.the thread scheduler will decides, in which order thread will be executed.
 */
public class Case1{
    public static void main(String[] args) {
        MyThreadCase1 case1 = new MyThreadCase1();
        case1.start();

        for (int loopmain = 1; loopmain <= 5; loopmain++) {
            System.out.println(" This is Main Thread : "+loopmain);
        }
    }

}

class MyThreadCase1 extends Thread{
    @Override
   public void run(){
        for (int loop = 1; loop <= 5; loop++) {
            System.out.println(" This is Child Thread == "+loop);
        }
    }
}