package com.university.oop.demo.third.creational.factory.simple;

/**
 * A demo to illustrate the Simple Factory method
 * pattern.
 */
public class SimpleFactoryDesignPatternDemo {
    public static void main(String[] args) {
        Shape s1 = handleButtonOnePressed();
        Shape s2 = handleButtonTwoPressed();

        System.out.println(s1.getClass().getSimpleName());
        System.out.println(s2.getClass().getSimpleName());
    }

    private static Shape handleButtonOnePressed() {
        return ShapeFactory.createShape("circle");
    }

    private static Shape handleButtonTwoPressed() {
        return ShapeFactory.createShape("rectangle");
    }
}
