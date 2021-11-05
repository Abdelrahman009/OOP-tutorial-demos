package com.university.oop.demo.second.solid.isp.bad;

import java.util.Date;

/**
 * Let's assume you bought a clock that have an alarm built-in,
 * tells you the time and has a little button that if pressed
 * it plays some music.
 */
public interface Clock {
    void configureAlarm(Date time);
    void stopAlarm();
    void playMusic();
    Date getTime();
    void setTime(Date time);
}
