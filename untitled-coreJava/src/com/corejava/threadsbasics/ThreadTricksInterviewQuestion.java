package com.corejava.threadsbasics;

public class ThreadTricksInterviewQuestion {
    public static void main(String[] args) {
        ChildThread ct = new ChildThread();
        Thread t = new Thread(ct);
        t.start();

        System.out.println("Main Thread");
    }


}
