package com.university.oop.demo.fifth.behavioral.state;

import com.university.oop.demo.fifth.behavioral.state.phonestates.*;

public class MobilePhone {
    /**
     * Bad way to implement it.
     */
    private String state;

    /**
     * Good way to implement it.
     */
    private PhoneState phoneState;

    public MobilePhone() {
        phoneState = new ShutdownState();
    }

    /**
     * A bad way to handle states and transitions.
     */
    public void setState(String newState) {
        this.state = newState;
    }

    /**
     * Why is this method bad?
     */
    public void receiveNotificationBadExample() {
        switch (state) {
            case "normal":
                System.out.println("Notification tone is being played.");
                break;
            case "vibrate":
                System.out.println("Short vibration");
                break;
            case "shutdown":
                // do nothing
                break;
            case "airplane":
                System.out.println("Blocking notification");
                break;
            default:
                throw new IllegalStateException();
        }
    }

    /**
     * A good way to handle states.
     */
    public void turnOn() {
        phoneState = new NormalState();
    }

    public void turnOff() {
        phoneState = new ShutdownState();
    }

    public void turnOnAirplaneMode() {
        phoneState = new AirplaneModeState();
    }

    public void turnOnVibrationMode() {
        phoneState = new VibratingState();
    }

    public void receiveCall() {
        phoneState.receiveCall();
    }

    public void alarmRing() {
        phoneState.alarmRing();
    }

    public void receiveNotification() {
        phoneState.receiveNotification();
    }
}
