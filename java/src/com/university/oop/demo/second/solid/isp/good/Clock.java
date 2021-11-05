package com.university.oop.demo.second.solid.isp.good;

import java.util.Date;

/**
 * Let's assume you bought a clock that have an alarm built-in,
 * tells you the time and has a little button that if pressed
 * it plays some music.
 */
public class Clock implements MusicPlayer, TimePiece, Alarm {
    @Override
    public void configureAlarm(Date time) {

    }

    @Override
    public void stopAlarm() {

    }

    @Override
    public void playMusic() {

    }

    @Override
    public Date getTime() {
        return null;
    }

    @Override
    public void setTime(Date time) {

    }
}
