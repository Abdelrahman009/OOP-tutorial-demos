package com.university.oop.demo.first.polymorphism.staticbinding;

/**
 * A class illustrating the overloading concept.
 */
public class OverloadingClassDemo {
    public static void doSomething() {
        System.out.println
                ("doSomething is called without params.");
    }

    public static void doSomething(String something) {
        System.out.println("doSomething is called with string parameter: " + something);
    }

    public static void doSomething(float value) {
        System.out.println("doSomething is called with float parameter: " + value);
    }
}
