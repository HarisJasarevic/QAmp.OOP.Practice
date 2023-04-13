package com.QAmp.HarisJasarevic.Projects.lesson1.procedural;

public class Procedural {

    //Procedural programing practice code for shapes

    public static void main (String[] args) {
        final String shape = "Circle";
        final double dimension = 3.0;

        System.out.println(getArea(shape, dimension));
    }

    static double getArea (final String shape, final double dimension) {
        if ("Square".equals(shape)) {
            return getAreaOfSquare(dimension);
        } else if ("Circle".equals(shape)) {
            return getAreaOfCircle(dimension);
        }else {
            return 0;
        }
    }
    static double getAreaOfSquare (final double a) {
        return a * a;
    }

    static double getAreaOfCircle (final double r) {
        return r * r * Math.PI;
    }
}
