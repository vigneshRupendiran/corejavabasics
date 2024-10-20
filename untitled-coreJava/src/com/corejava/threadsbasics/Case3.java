package com.corejava.threadsbasics;

public class Case3 {
    public static void main(String[] args) {
        MyThreadCase3 case3 = new MyThreadCase3();
        case3.start(); //it helps to create a new child thread

        for (int loopmain = 1; loopmain <= 5; loopmain++) {
            System.out.println(" This is Main Thread : "+loopmain);
        }
    }
}

class MyThreadCase3 extends Thread{
    @Override
    public void run(){
        for (int loop = 1; loop <= 5; loop++) {
            System.out.println(" This is run method == "+loop);
        }
    }
}
