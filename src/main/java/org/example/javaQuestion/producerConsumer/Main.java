package org.example.javaQuestion.producerConsumer;

public class Main {
    public static void main(String[] args) {
        Resource resource = new Resource(5);

        Producer producer = new Producer(resource);
        Consumer consumer = new Consumer(resource);


        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();
    }
}
