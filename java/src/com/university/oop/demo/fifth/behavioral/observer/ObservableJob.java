package com.university.oop.demo.fifth.behavioral.observer;

public interface ObservableJob {
    void register(AvailableJobObserver observer);
    void unregister(AvailableJobObserver observer);
    String getPosition();
}
