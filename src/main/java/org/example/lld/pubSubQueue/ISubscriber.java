package org.example.lld.pubSubQueue;

public interface ISubscriber {
    void consumeData();
    void wakeUpIfNeeded();
}
