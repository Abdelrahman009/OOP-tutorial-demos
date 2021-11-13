package com.university.oop.demo.third.creational.singleton.problem;

import com.university.oop.demo.third.creational.singleton.SpeakerDriver;

import java.util.Iterator;
import java.util.List;

public class NonSingletonSpeakerDriver implements SpeakerDriver {
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
