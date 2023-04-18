package com.QAmp.HarisJasarevic.Projects.lesson1.oop;

public class Square extends Shape {

    private final double side;

    public Square (final double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
