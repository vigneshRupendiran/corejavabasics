package com.corejava.threadsbasics;

public class ChildThread extends Thread{
    @Override
    public void run(){
        for (int loop = 1; loop <= 5; loop++) {
            System.out.println(" This is Child Thread == "+loop);
        }
    }
}
