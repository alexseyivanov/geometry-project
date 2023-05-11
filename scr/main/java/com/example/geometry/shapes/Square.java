package com.example.geometry.shapes;

import com.example.geometry.exceptions.ShapeException;

public class Square extends Shape {
    private double side;

    public Square(double side) throws ShapeException {
        if (side <= 0) {
            throw new ShapeException("Invalid side length for square");
        }
        this.side = side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
