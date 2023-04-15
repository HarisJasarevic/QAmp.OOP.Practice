package com.QAmp.HarisJasarevic.Projects.lesson3.encapsulation;

public class Dog2 {
    private Animal animal;
    private int legs;
    public Dog2 (final String name, int legs) {
        animal = new Animal(name);
        this.legs = legs;
    }
}
