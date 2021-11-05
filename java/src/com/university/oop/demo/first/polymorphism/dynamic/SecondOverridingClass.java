package com.university.oop.demo.first.polymorphism.dynamic;

public class SecondOverridingClass implements OverridingDemoInterface {
    @Override
    public void doSomething() {
        System.out.println("doSomething is called from " + getClass().getSimpleName());
    }
}
