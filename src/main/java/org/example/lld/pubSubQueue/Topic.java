package org.example.lld.pubSubQueue;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
public class Topic {
    private String id;
    private String topicName;
    private List<Message> messages;
    private List<ISubscriber> subscribers;

    public Topic(String topicName) {
        this.id = String.valueOf(UUID.randomUUID());
        this.topicName = topicName;
        this.messages = new ArrayList<>();
        this.subscribers = new ArrayList<>();
    }

    public void produceMessage(String msg) {
        messages.add(new Message(msg, String.valueOf(UUID.randomUUID())));
        for (ISubscriber sub : subscribers) {
            sub.wakeUpIfNeeded();
        }
    }

    public void addSubscriber(String consumerName) {
        Subscriber subscriber = new Subscriber(consumerName, this);
        subscribers.add(subscriber);

        new Thread(subscriber).start();
    }
}
