// package com.example.geometry;

// import com.example.geometry.exceptions.ShapeException;
// import com.example.geometry.shapes.*;
// import com.example.geometry.utils.ShapeCollection;

// public class Main {
//     public static void main(String[] args) {
//         ShapeCollection shapeCollection = new ShapeCollection();

//         try {
//             shapeCollection.addShape(new Triangle(3, 4, 5));
//             shapeCollection.addShape(new Square(4));
//             shapeCollection.addShape(new Rectangle(3, 5));
//             shapeCollection.addShape(new Circle(5));
//         } catch (ShapeException e) {
//             System.err.println(e.getMessage());
//         }

//         shapeCollection.printShapesInfo();
//         shapeCollection.sortByArea();
//         System.out.println("Sorted by area:");
//         shapeCollection.printShapesInfo();
//     }
// }
package com.example.geometry;

import com.example.geometry.shapes.*;
import com.example.geometry.utils.ShapeCollection;

public class Main {
    public static void main(String[] args) {
        // Создание экземпляра класса ShapeCollection
        ShapeCollection shapeCollection = new ShapeCollection();

        // Создание и добавление новых фигур
        try {
            Triangle triangle = new Triangle(3, 4, 5);
            shapeCollection.addShape(triangle);

            Square square = new Square(4);
            shapeCollection.addShape(square);

            Rectangle rectangle = new Rectangle(4, 5);
            shapeCollection.addShape(rectangle);

            Circle circle = new Circle(6);
            shapeCollection.addShape(circle);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Изменение фигуры по индексу (например, обновление квадрата с индексом 1)
        try {
            Square newSquare = new Square(5);
            shapeCollection.updateShape(1, newSquare);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Сортировка фигур по площади
        shapeCollection.sortByArea();

        // Вывод информации о фигурах в коллекции
        shapeCollection.printShapesInfo();
    }
}
