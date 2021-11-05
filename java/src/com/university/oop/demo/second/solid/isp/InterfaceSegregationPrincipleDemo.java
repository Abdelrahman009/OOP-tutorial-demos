package com.university.oop.demo.second.solid.isp;

import com.university.oop.demo.second.solid.isp.bad.Clock;
import com.university.oop.demo.second.solid.isp.good.Alarm;
import com.university.oop.demo.second.solid.isp.good.MusicPlayer;
import com.university.oop.demo.second.solid.isp.good.TimePiece;

import java.util.Date;
import java.util.List;

/**
 * A demo to illustrate the ISP.
 *
 * "Many client specific interfaces are better than one general purpose interface"
 */
public class InterfaceSegregationPrincipleDemo {

    public class Student {

        // ...
        // some properties.
        // ...

        Date wakeUpTime;

        // ..
        // some code and methods.
        // ..


        /**
         * Which do you think is better?
         * depending on an Alarm or the Clock?
         */
        void setAlarm(Alarm alarm) {
            alarm.configureAlarm(wakeUpTime);
        }

        void setAlarm(Clock clock) {
            clock.configureAlarm(wakeUpTime);
        }
    }


    public class Kid {

        // ... some code


        /**
         * Which do you think is better?
         * depending on an MusicPlayer or the Clock?
         */
        void playMusic(MusicPlayer musicPlayer) {
            musicPlayer.playMusic();
        }

        void playMusic(Clock clock) {
            clock.playMusic();
        }
    }

    public class ClinicReceptionist {

        // ... some code

        /**
         * A clinic receptionist needs something
         * to tell them the time to see reservation
         * times.
         *
         * Which do you think is better?
         * depending on a TimePiece or the Clock?
         */
        void setTimePiece(TimePiece timePiece) {
            timePiece.setTime(new Date());
        }

        void setTimePiece(Clock clock) {
            clock.setTime(new Date());
        }
    }
}
