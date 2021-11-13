package com.university.oop.demo.third.creational.prototype;

import java.util.Random;

public class Circle implements Shape {
    private double radius;

    public Circle() {
        radius = (new Random()).nextDouble();
    }

    public Circle(double r) {
        this.radius = r;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public Clonable clone() {
        return new Circle(radius);
    }

    @Override
    public String toString() {
        return "Circle {" +
                "radius=" + radius +
                '}';
    }
}
