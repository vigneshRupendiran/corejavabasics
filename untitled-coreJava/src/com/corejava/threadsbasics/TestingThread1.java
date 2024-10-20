package com.corejava.threadsbasics;

public class TestingThread1 {
    public static void main(String[] args) {
MyThread threadChild = new MyThread();
threadChild.start();

        for (int i = 1; i <= 10; i++) {
            System.out.println("Main Thread "+i);
        }
    }
}


class MyThread extends Thread{
  public void run(){
      for (int i = 1; i <= 10; i++) {
          System.out.println("Child Thread "+i);
      }
  }
}