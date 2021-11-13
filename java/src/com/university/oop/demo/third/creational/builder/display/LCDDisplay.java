package com.university.oop.demo.third.creational.builder.display;

public class LCDDisplay implements Display {
    @Override
    public void displayContent(String someEncodedContent) {
        System.out.println
            ("Displaying contents with LCD display:\n" + someEncodedContent);
    }
}
