package com.university.oop.demo.third.creational.prototype;

import java.util.Random;

public class Rectangle implements Shape {
    private double width;
    private double length;

    public Rectangle() {
        this.length = (new Random()).nextDouble();
        this.width = (new Random()).nextDouble();
    }

    public Rectangle(double l, double w) {
        this.length = l;
        this.width = w;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }

    @Override
    public Clonable clone() {
        return new Rectangle(length, width);
    }

    @Override
    public String toString() {
        return "Rectangle {" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
