package com.example.geometry.utils;

import com.example.geometry.shapes.Shape;
import com.example.geometry.shapes.Circle;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ShapeCollection {
    private List<Shape> shapes;

    public ShapeCollection() {
        shapes = new ArrayList<>();
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void removeShape(int index) {
        shapes.remove(index);
    }

    public void updateShape(int index, Shape shape) {
        shapes.set(index, shape);
    }

    public void sortByArea() {
        shapes.sort(Comparator.comparingDouble(Shape::calculateArea));
    }

    public void printShapesInfo() {
        for (Shape shape : shapes) {
            System.out.println(shape.getClass().getSimpleName() + ":");
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            System.out.println("Area: " + shape.calculateArea());
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                System.out.println("Circumference: " + circle.calculateCircumference());
            }
            System.out.println();
        }
    }
}
