package com.QAmp.HarisJasarevic.Projects.lesson1.oop;


import java.util.ArrayList;
import java.util.List;

public class OOP {

    //OOP practice code for shapes

    public static void main(String[] args) {
        final Shape circle = new Circle(3);
        final Shape square = new Square(2);

        final List<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(square);

        for (Shape shape : shapes) {
            System.out.println(shape.getArea());
        }

        System.out.println(circle.getArea());
        System.out.println(square.getArea());
    }
}
