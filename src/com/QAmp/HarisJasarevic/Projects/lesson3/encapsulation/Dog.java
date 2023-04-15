package com.QAmp.HarisJasarevic.Projects.lesson3.encapsulation;

public class Dog extends Animal {
    private int legs;

    public Dog (final String name, final int legs) {
        super(name);
        this.legs = legs;
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println(this.name + " vuf vuf");
    }
}
