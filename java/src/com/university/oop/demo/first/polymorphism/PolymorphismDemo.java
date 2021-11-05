package com.university.oop.demo.first.polymorphism;

import com.university.oop.demo.first.polymorphism.dynamic.FirstOverridingClass;
import com.university.oop.demo.first.polymorphism.dynamic.OverridingDemoInterface;
import com.university.oop.demo.first.polymorphism.dynamic.SecondOverridingClass;
import com.university.oop.demo.first.polymorphism.staticbinding.OverloadingClassDemo;

import java.util.Scanner;

/**
 * This demo illustrates the static and dynamic binding
 * (overloading vs overriding).
 */
public class PolymorphismDemo {
    public static void main(String[] args) {

        /**
         * At compile time you are able to know which
         * function will be called from the {@link OverloadingClassDemo}
         *
         * This is the static binding or overloading.
         */
        OverloadingClassDemo.doSomething();
        OverloadingClassDemo.doSomething("Hi from main function.");

        /**
         * At compile time you are not able to know which
         * function will be called from the different
         * implementations of the {@link OverridingDemoInterface}
         *
         * This is the dynamic binding or overriding.
         */
        OverridingDemoInterface demoObj = new FirstOverridingClass();

        Scanner scanner = new Scanner(System.in);
        Integer input = scanner.nextInt();
        if (input == 2)
            demoObj = new SecondOverridingClass();

        /**
         * At this point you don't know which implementation
         * of the doSomething method will be called, you need
         * to run the code to know (at runtime).
         */
        demoObj.doSomething();
    }
}
