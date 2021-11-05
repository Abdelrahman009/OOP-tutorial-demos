package com.university.oop.demo.second.solid.dip;

import java.util.Date;

/**
 * A demo to illustrate the DIP.
 *
 * "Depend upon Abstractions. Do not depend upon concretions."
 */
public class DependencyInversionPrincipleDemo {

    /**
     * If I need a method that uses an alarm in my code
     * is it better to depend on the alarm interface?
     * or should you depend on the concrete classes?
     */
    public void useAlarm(Alarm alarm) {
        alarm.configureAlarm(new Date());
    }

    /**
     * Imagine if I wanted to add another class that can be
     * used as an alarm "a clock for example"
     *
     * is it better to add its specific method or just use the
     * method above?
     */
    public void useTvAlarm(TV tv) {
        // sets the alarm in tv object.
        tv.configureAlarm(new Date());
    }

    public void usePhoneAlarm(Phone phone) {
        // sets the alarm in phone object.
        phone.configureAlarm(new Date());
    }
}
