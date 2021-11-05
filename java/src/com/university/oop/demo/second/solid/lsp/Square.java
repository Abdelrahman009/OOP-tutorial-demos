package com.university.oop.demo.second.solid.lsp;

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    /**
     * Prevent setting one side without setting the other.
     */
    @Override
    public void setLength(double l) {
        super.setLength(l);
        super.setWidth(l);
    }

    /**
     * Prevent setting one side without setting the other.
     */
    @Override
    public void setWidth(double w) {
        super.setLength(w);
        super.setWidth(w);
    }
}
