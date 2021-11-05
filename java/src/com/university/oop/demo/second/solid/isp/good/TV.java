package com.university.oop.demo.second.solid.isp.good;

import java.util.Date;


/**
 * You can use the TV as an alarm can't you?
 * If it turns on with high volume.
 */
public class TV implements Alarm, Display {

    @Override
    public void configureAlarm(Date time) {
        // configures to turn on at the specified time.
    }

    @Override
    public void stopAlarm() {
        // turn the TV on
    }

    @Override
    public void showMedia() {

    }

    @Override
    public void setVolume(int volumeLevel) {

    }

    @Override
    public void setChannel(int channelnumber) {

    }
}
