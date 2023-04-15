package com.QAmp.HarisJasarevic.Projects.lesson3.assignment;

    //Encapsulation and inheritance practice

public class Velocipede {

    protected int tires;
    protected double speed;

    public Velocipede (final int tires) {
        this.tires = tires;
        this.speed = 0.0;
    }

    public double speedUp (final double speed) {
        this.speed += speed;
        return speed;
    }

    @Override
    public String toString () {
        return "Tires: " + tires + ", speed: " + speed;
    }
}
