package org.example.javaQuestion.evenOddUsingTwoThread;

public class PrintNumbers implements Runnable {
    private int data = 0;

    @Override
    public void run() {
        while (data < 10) {
            if (data % 2 == 0 && Thread.currentThread().getName().equals("even")) {
                synchronized (this) {
                    System.out.println("Thread name : " + Thread.currentThread().getName() + " .value: " + data);
                    data++;
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            } else if (data % 2 != 0 && Thread.currentThread().getName().equals("odd")) {
                synchronized (this) {
                    System.out.println("Thread name : " + Thread.currentThread().getName() + " .value: " + data);
                    data++;
                    this.notify();
                }
            }
        }
    }
}
