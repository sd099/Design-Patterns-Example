package org.example.lld.pubSubQueue;

public class Main {
    public static void main(String[] args) {

        QueueService queueService = new QueueService();

        queueService.createTopic(new Topic("topic1"));

        queueService.addConsumer("topic1", "topic1-consumer1");

        queueService.produceMessage("topic1", "msg1");
        queueService.produceMessage("topic1", "msg2");
        queueService.produceMessage("topic1", "msg3");
        queueService.produceMessage("topic1", "msg4");
        queueService.addConsumer("topic1", "topic1-consumer2");
        queueService.produceMessage("topic1", "msg5");
        queueService.produceMessage("topic1", "msg6");

        queueService.createTopic(new Topic("topic2"));

        queueService.addConsumer("topic2", "topic2-consumer1");
        queueService.produceMessage("topic2", "msg1");
        queueService.produceMessage("topic2", "msg2");
        queueService.produceMessage("topic2", "msg3");
        queueService.produceMessage("topic2", "msg4");
        queueService.produceMessage("topic2", "msg5");
        queueService.produceMessage("topic2", "msg6");

        queueService.produceMessage("topic1", "msg7");
        queueService.produceMessage("topic1", "msg8");

        queueService.produceMessage("topic2", "msg7");
        queueService.produceMessage("topic2", "msg8");
    }
}
