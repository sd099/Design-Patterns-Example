package org.example.producerConsumer;

public class Producer implements Runnable{

    private Resource resource;

    public Producer(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        Integer item = 1;
        while(true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Exception during thread sleep" + Thread.currentThread().getName());
            }
            resource.addItem(item);
            item++;
        }
    }
}
