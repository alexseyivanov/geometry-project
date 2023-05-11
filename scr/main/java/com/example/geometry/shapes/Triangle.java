package com.example.geometry.shapes;

import com.example.geometry.exceptions.ShapeException;

public class Triangle extends Shape {
    private double a, b, c;

    public Triangle(double a, double b, double c) throws ShapeException {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new ShapeException("Invalid triangle sides");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

    @Override
    public double calculateArea() {
        double s = calculatePerimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
