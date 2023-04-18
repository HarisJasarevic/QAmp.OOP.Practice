package com.QAmp.HarisJasarevic.Projects.lesson1.oop;

public class Circle extends Shape {

    //OOP practice code for shapes

    private final double radius;

    public Circle(final double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }


}
