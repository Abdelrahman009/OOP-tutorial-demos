package com.university.oop.demo.fifth.behavioral.state.phonestates;

public class VibratingState implements PhoneState {
    @Override
    public void receiveCall() {
        System.out.println("Long vibration");
    }

    @Override
    public void alarmRing() {
        System.out.println("Long repetitive vibration");
    }

    @Override
    public void receiveNotification() {
        System.out.println("Short vibration");
    }
}
