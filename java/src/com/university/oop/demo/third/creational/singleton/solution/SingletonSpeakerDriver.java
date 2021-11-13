package com.university.oop.demo.third.creational.singleton.solution;

import com.university.oop.demo.third.creational.singleton.SpeakerDriver;

import java.util.Iterator;
import java.util.List;

public class SingletonSpeakerDriver implements SpeakerDriver {

    private static SingletonSpeakerDriver driverInstance;
    private SingletonSpeakerDriver() {}

    public static SingletonSpeakerDriver getOrCreateSpeakerDriver() {
        if (driverInstance == null)
            driverInstance = new SingletonSpeakerDriver();
        return driverInstance;
    }

    @Override
    public synchronized void playSound(List<String> soundSegments) {
        Iterator<String> soundSegmentIterator = soundSegments.iterator();
        while (soundSegmentIterator.hasNext()) {
            String soundSegment = soundSegmentIterator.next();
            System.out.println(soundSegment);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
