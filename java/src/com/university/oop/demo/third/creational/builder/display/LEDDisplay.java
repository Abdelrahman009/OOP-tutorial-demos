package com.university.oop.demo.third.creational.builder.display;

public class LEDDisplay implements Display {
    @Override
    public void displayContent(String someEncodedContent) {
        System.out.println
            ("Displaying contents with LED display:\n" + someEncodedContent);
    }
}
