package com.university.oop.demo.second.solid.dip;

import java.util.Date;

public class TV implements Alarm {
    @Override
    public void configureAlarm(Date time) {

    }

    @Override
    public void stopAlarm() {

    }

    // some TV specific methods.
    public void changeChannel() {}
    public void changeVolume() {}
    public void changeSource() {}

    // ...etc.
}
