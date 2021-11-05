package com.university.oop.demo.second.solid.lsp;

/**
 * This demo illustrates the LSP importance.
 *
 * "Subclasses should be substitutable for their base classes."
 */
public class LiskovSubstitutionPrincipleDemo {

    public static void main(String[] args) {

        /**
         * Imagine for some reason in my code I needed
         * to create a rectangle with equal sides.
         *
         * There are two ways to achieve this programmed by two
         * different programmers.
         *
         * let's see the difference as we go.
         */
        Rectangle rectangleOne = createEqualSidesRectangleTheFirstWay(2.0);
        Rectangle rectangleTwo = createEqualSidesRectangleTheSecondWay(2.0);

        /**
         * Both rectangles have the same and correct area.
         */
        System.out.println(rectangleOne.getArea());
        System.out.println(rectangleTwo.getArea());

        // imagine there is some code.
        // .......


        /**
         * For some reason I had to resize my rectangle.
         *
         * let's try it using the two different implementations.
         */
        rectangleOne.setLength(3.0);
        rectangleOne.setWidth(4.0);

        rectangleTwo.setLength(3.0);
        rectangleTwo.setWidth(4.0);

        /**
         * I expect the new area to be 12 for both rectangles
         * doesn't that make sense?
         */
        System.out.println(rectangleOne.getArea());
        System.out.println(rectangleTwo.getArea());

        /**
         * What do you think went wrong?
         */
    }

    /**
     * The first programmer used the rectangle constructor passing the
     * side twice.
     */
    private static Rectangle createEqualSidesRectangleTheFirstWay(double side) {
        return new Rectangle(side, side);
    }

    /**
     * The second programmer used the square constructor passing the
     * side only once under the assumption every square is a rectangle.
     */
    private static Rectangle createEqualSidesRectangleTheSecondWay(double side) {
        return new Square(side);
    }
}
