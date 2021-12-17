package com.university.oop.demo.fifth.behavioral.observer;

import java.util.HashSet;
import java.util.Set;

public class Job implements ObservableJob {
    private Set<AvailableJobObserver> availableJobObserverSet;
    private boolean jobStatus;
    private String position;

    public Job(String position, boolean isJobAvailable) {
        this.availableJobObserverSet = new HashSet<>();
        this.jobStatus = isJobAvailable;
        this.position = position;
    }

    @Override
    public void register(AvailableJobObserver observer) {
        availableJobObserverSet.add(observer);
    }

    @Override
    public void unregister(AvailableJobObserver observer) {
        availableJobObserverSet.remove(observer);
    }

    @Override
    public String getPosition() {
        return position;
    }

    public void setIsJobAvailable(boolean jobStatus) {
        this.jobStatus = jobStatus;
        if (jobStatus)
            for (AvailableJobObserver observer : availableJobObserverSet) {
                observer.notify(this);
            }
    }
}
