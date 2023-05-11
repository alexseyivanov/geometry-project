package com.example.geometry.shapes;

import com.example.geometry.exceptions.ShapeException;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) throws ShapeException {
        if (radius <= 0) {
            throw new ShapeException("Invalid radius for circle");
        }
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return calculatePerimeter();
    }
}
