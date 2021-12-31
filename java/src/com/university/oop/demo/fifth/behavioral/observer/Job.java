package com.university.oop.demo.fifth.behavioral.observer;

import java.util.HashSet;
import java.util.Set;

public class Job implements ObservableJob {
    private Set<AvailableJobObserver> availableJobObserverSet;
    private boolean jobStatus;
    private String jobTitle;

    public Job(String jobTitle, boolean isJobAvailable) {
        this.availableJobObserverSet = new HashSet<>();
        this.jobStatus = isJobAvailable;
        this.jobTitle = jobTitle;
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
    public String getJobTitle() {
        return jobTitle;
    }

    public void setIsJobAvailable(boolean jobStatus) {
        this.jobStatus = jobStatus;
        if (jobStatus)
            for (AvailableJobObserver observer : availableJobObserverSet) {
                observer.notify(this);
            }
    }

    public boolean isJobStatus() {
        return jobStatus;
    }
}
