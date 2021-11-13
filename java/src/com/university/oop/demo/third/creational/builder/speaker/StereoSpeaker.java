package com.university.oop.demo.third.creational.builder.speaker;

public class StereoSpeaker implements Speaker {
    @Override
    public void playSound(String someEncodedContent) {
        System.out.println
            ("Playing sound through stereo speakers:\n" + someEncodedContent);
    }
}
