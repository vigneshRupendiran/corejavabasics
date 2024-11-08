package com.corejava.threadsbasics.consprodproblem;

import java.util.LinkedList;
import java.util.Queue;

public class OrderQueue {
    private final Queue<Order> queue = new LinkedList<>();
    private final int capacity;

    public OrderQueue(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void produce(Order order) throws InterruptedException {
        while (queue.size()==capacity){
           wait(); //wait if the queue is full
        }
        queue.offer(order);
        System.out.println("Produced Order : "+order.getOrderId());
        notifyAll(); //Notify consumers that an order is available
    }

    public synchronized Order consume() throws InterruptedException {
        while (queue.isEmpty()){
            wait();//wait if the queue is empty
        }
        Order order = queue.poll();
        System.out.println("Consumed Order : "+order.getOrderId());
        notifyAll(); //Notify producers that space is available
        return order;
    }

}
