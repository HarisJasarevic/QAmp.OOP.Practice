package com.QAmp.HarisJasarevic.Projects.lesson3.encapsulation;

public class Animal implements Comparable<Animal> {

    protected String name;

    public Animal (final String name) {
        this.name = name;
    }

    public void makeSound () {
        System.out.println(this.name + " has made a sound");
    }

    @Override
    public int compareTo(Animal o) {
        return this.name.compareTo(o.name);
    }

    public String toString () {
        return this.name;
    }
}
