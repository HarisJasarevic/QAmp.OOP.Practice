package com.QAmp.HarisJasarevic.Projects.lesson1.circle;

public class CircleMain {

    //OOP practice code

    public static void main(String[] args) {

        final Circle circle = new Circle("Red", 2.0);
        final Circle circle1 = new Circle("Blue");

        circle.printCircle();
        circle1.printCircle();

        circle.doubleCircle();
        circle.doubleCircle();
        circle.doubleCircle();

        circle.printCircle();

        circle1.setRadius(5);
        circle1.printCircle();

    }
}
