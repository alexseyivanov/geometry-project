package com.example.geometry.shapes;

import com.example.geometry.exceptions.ShapeException;

public class Rectangle extends Shape {
    private double length, width;

    public Rectangle(double length, double width) throws ShapeException {
        if (length <= 0 || width <= 0) {
            throw new ShapeException("Invalid dimensions for rectangle");
        }
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}
