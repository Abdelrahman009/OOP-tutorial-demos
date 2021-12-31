package com.university.oop.demo.fifth.behavioral.state;

/**
 * A demo to illustrate the behavioral pattern "State"
 *
 * "The State design pattern allows an object to alter
 *  its behavior when its internal state changes. The
 *  object will appear to change its class."
 *
 * let's imagine you are representing a mobile phone.
 * it has many states on/off, normal/vibrating or even
 * airplane mode.
 *
 * how would you implement functions that deals with notifying
 * the user with new notifications?
 * with received calls and messages?
 */
public class StateDesignPatternDemo {

    public static void main(String[] args) {

        /**
         * What is wrong with this method?
         */
        MobilePhone mobilePhone = new MobilePhone();
        mobilePhone.setState("normal");
        mobilePhone.receiveNotificationBadExample();

        System.out.println("======================");

        /**
         * How about implementing it this way
         */

        mobilePhone.turnOn();
        mobilePhone.receiveCall();
        mobilePhone.turnOnAirplaneMode();
        mobilePhone.receiveCall();
        mobilePhone.turnOnVibrationMode();
        mobilePhone.receiveCall();
        mobilePhone.turnOff();
        mobilePhone.receiveCall();

        /**
         * It seems like we are changing the method's
         * code all together doesn't it?
         */
    }
}
