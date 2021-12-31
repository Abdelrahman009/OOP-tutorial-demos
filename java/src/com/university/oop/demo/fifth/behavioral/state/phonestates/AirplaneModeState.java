package com.university.oop.demo.fifth.behavioral.state.phonestates;

public class AirplaneModeState implements PhoneState {
    @Override
    public void receiveCall() {
        System.out.println("Blocking call");
    }

    @Override
    public void alarmRing() {
        System.out.println("Alarm ringing");
    }

    @Override
    public void receiveNotification() {
        System.out.println("Blocking notification");
    }
}
