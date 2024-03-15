package org.example.javaQuestion.producerConsumer;

import java.util.LinkedList;
import java.util.Queue;

public class Resource {

    private Queue<Integer> data;
    private Integer bufferSize;

    public Resource(Integer bufferSize) {
        this.bufferSize = bufferSize;
        this.data = new LinkedList<>();
    }

    public synchronized void addItem(Integer item) {
        while (data.size() == bufferSize) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println("Exception during thread wait" + Thread.currentThread().getName());
            }
        }

        data.add(item);
        System.out.println("Produced Data. Item: " + item);
        notifyAll();
    }

    public synchronized void consumeItem() {
        while (data.size() == 0) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println("Exception during thread wait" + Thread.currentThread().getName());
            }
        }

        Integer item = data.poll();
        System.out.println("Consumed data.Item: " + item);
        notifyAll();
    }
}
