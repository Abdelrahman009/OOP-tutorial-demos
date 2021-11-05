package com.university.oop.demo.second.solid.dip;

import java.util.Date;

public class Phone implements Alarm {
    @Override
    public void configureAlarm(Date time) {

    }

    @Override
    public void stopAlarm() {

    }


    // phone specific methods.
    public void callNumber() {}
    public void lockPhone() {}
    public void changeBrightness() {}

    // ...etc.
}
