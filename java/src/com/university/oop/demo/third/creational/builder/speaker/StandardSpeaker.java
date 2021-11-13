package com.university.oop.demo.third.creational.builder.speaker;

public class StandardSpeaker implements Speaker {
    @Override
    public void playSound(String someEncodedContent) {
        System.out.println
             ("Playing sound through standard speakers:\n" + someEncodedContent);
    }
}
