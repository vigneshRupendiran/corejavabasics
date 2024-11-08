package com.corejava.threadsbasics;

public class JoinTest {
    public static void main(String[] args) {
        Task task1 = new Task("Task 1");
        Task task2 = new Task("Task 2");
        Task task3 = new Task("Task 3");

        task1.start();
        task2.start();
        task3.start();

        try {
            task1.join();
            //task2.interrupt();
            task2.join();
            task3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("All tasks finished.");
    }
}

class Task extends Thread {
    private String name;

    Task(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println(name + " started.");
        try {
            // Simulate time-consuming task
            Thread.sleep((long) (Math.random() * 1000));
        } catch (InterruptedException e) {
            System.out.println(name + " interrupted.");
        }
        System.out.println(name + " finished.");
    }
}

