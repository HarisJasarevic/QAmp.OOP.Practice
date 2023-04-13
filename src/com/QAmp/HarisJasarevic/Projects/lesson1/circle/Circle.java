package com.QAmp.HarisJasarevic.Projects.lesson1.circle;

public class Circle {

    //OOP practice code for shapes

    private String color;
    private double radius;

    public Circle (final String color) {
        this (color, 1.0);
    }

    public Circle(final String color, final double radius) {
        this.color = color;
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    public void setRadius(final double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
    public double getCircumference() {
        return 2 * radius * Math.PI;
    }

    public void doubleCircle() {
        this.radius = 2 * this.radius;
    }

    public void printCircle() {
        System.out.println("This is a " + this.color + " circle with radius = " + this.radius);
    }

}
