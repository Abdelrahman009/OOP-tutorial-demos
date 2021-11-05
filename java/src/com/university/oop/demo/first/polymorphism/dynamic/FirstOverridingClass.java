package com.university.oop.demo.first.polymorphism.dynamic;

public class FirstOverridingClass implements OverridingDemoInterface {
    @Override
    public void doSomething() {
        System.out.println("doSomething is called from " + getClass().getSimpleName());
    }
}
