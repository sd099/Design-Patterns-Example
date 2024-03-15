package org.example.lld.pubSubQueue;

import lombok.Data;
import java.util.UUID;

@Data
public class Subscriber implements ISubscriber, Runnable {

    private String subsId;
    private String subscriberName;
    private Topic topic;
    private int offset;

    public Subscriber(String subscriberName, Topic topic) {
        this.subscriberName = subscriberName;
        this.subsId = String.valueOf(UUID.randomUUID());
        this.topic = topic;
        this.offset = 0;
    }

    @Override
    public void consumeData() {
        synchronized (this) {
            do {
                while (offset == topic.getMessages().size()) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(Thread.currentThread().getName() + " : " + topic.getTopicName() + " : " + topic.getMessages().get(offset).getMsg());
                offset++;
            } while (true);
        }
    }

    @Override
    public synchronized void wakeUpIfNeeded() {
        synchronized (this) {
            notify();
        }
    }

    @Override
    public void run() {
        consumeData();
    }
}
