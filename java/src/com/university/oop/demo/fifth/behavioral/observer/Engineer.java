package com.university.oop.demo.fifth.behavioral.observer;

public class Engineer implements AvailableJobObserver {
    private boolean isEmployed;
    private String name;

    public Engineer(String name, boolean isEmployed) {
        this.name = name;
        this.isEmployed = isEmployed;
    }

    @Override
    public void notify(ObservableJob job) {
        if (! isEmployed)
            System.out.println("Engineer " + name + " applying for job " + job.getJobTitle());
    }

    public void setEmployed(boolean isEmployed) {
        this.isEmployed = isEmployed;
    }
}
