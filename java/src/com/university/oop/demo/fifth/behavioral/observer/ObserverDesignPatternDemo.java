package com.university.oop.demo.fifth.behavioral.observer;

/**
 * A demo to illustrate the behavioral pattern "Observer"
 *
 * "The Observer design pattern defines a one-to-many dependency
 *  between objects so that when one object changes state, all
 *  its dependents are notified and updated automatically."
 *
 *  Let's imagine that we are writing a code for some service
 *  that notifies unemployed engineers with jobs they are interested
 *  in.
 */
public class ObserverDesignPatternDemo {
    public static void main(String[] args) {
        Engineer john = new Engineer("John", true);
        Engineer martha = new Engineer("Martha", false);

        Job jobOne = new Job("SWE I", false);
        Job jobTwo = new Job("SWE II", false);

        /**
         * How can we make John and martha apply when the job becomes available?
         *
         * Should we run a background thread that asks the jobs for their
         * availability every 5 seconds for example? "Poll model"
         *
         * a wasteful approach
         *
         * new thread that does the following:
         * while (true) {
         *    sleep for a couple of seconds.
         *    check if a job available.
         *    if so take an action.
         *    else continue the loop
         * }
         *
         * How about notifying those engineers when the job status changes?
         */
        jobOne.register(john);
        jobOne.register(martha);
        jobTwo.register(john);
        jobTwo.register(martha);

        jobTwo.setIsJobAvailable(true);
        john.setEmployed(false);
        jobOne.setIsJobAvailable(true);
    }
}
