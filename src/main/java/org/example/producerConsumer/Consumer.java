package org.example.producerConsumer;

public class Consumer implements Runnable{
    private Resource resource;

    public Consumer(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println("Exception during thread sleep" + Thread.currentThread().getName());
            }
            resource.consumeItem();
        }
    }
}
