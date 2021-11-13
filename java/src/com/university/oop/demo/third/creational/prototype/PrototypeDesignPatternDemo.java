package com.university.oop.demo.third.creational.prototype;

/**
 * A demo to illustrate the prototype pattern.
 *
 * "The Prototype design pattern specifies the kind
 *  of objects to create using a prototypical instance,
 *  and create new objects by copying this prototype."
 */
public class PrototypeDesignPatternDemo {

    /**
     * Imagine the case when the user Ctrl + C and
     * Ctrl + V on a shape.
     */
    public static void main(String[] args) {
        Shape circle = new Circle();
        System.out.println(circle);
        System.out.println(circle.clone());

        Shape rectangle = new Rectangle();
        System.out.println(rectangle);
        System.out.println(rectangle.clone());
    }
}
