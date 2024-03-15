package org.example.lld.pubSubQueue;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class QueueService {

    private Map<String, Topic> topicDetailsMap;

    public QueueService() {
        this.topicDetailsMap = new HashMap<>();
    }

    public void createTopic(Topic topic) {
        if (topicDetailsMap.get(topic.getTopicName()) != null) {
            System.out.println(topic.getTopicName() + ": this topic already exist");
        } else {
            topicDetailsMap.put(topic.getTopicName(), topic);
        }
    }

    public void addConsumer(String topicName, String consumerName) {
        if (topicDetailsMap.get(topicName) == null) {
            System.out.println(topicName + ": this topic not exist");
        } else {
            Topic topic = topicDetailsMap.get(topicName);
            topic.addSubscriber(consumerName);
        }
    }

    public void produceMessage(String topicName, String msg) {
        if (topicDetailsMap.get(topicName) == null) {
            System.out.println(topicName + ": this topic not exist");
        } else {
            Topic topic = topicDetailsMap.get(topicName);
            topic.produceMessage(msg);
        }
    }
}
