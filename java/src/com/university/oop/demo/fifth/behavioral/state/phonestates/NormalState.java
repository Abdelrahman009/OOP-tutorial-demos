package com.university.oop.demo.fifth.behavioral.state.phonestates;

public class NormalState implements PhoneState {
    @Override
    public void receiveCall() {
        System.out.println("Ringtone is being played.");
    }

    @Override
    public void alarmRing() {
        System.out.println("Alarm is being played.");
    }

    @Override
    public void receiveNotification() {
        System.out.println("Notification tone is being played.");
    }
}
