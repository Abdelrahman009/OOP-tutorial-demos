package com.university.oop.demo.third.creational.factory.simple;

public class ShapeFactory {
    public static Shape createShape(String type) {
        switch (type) {
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
