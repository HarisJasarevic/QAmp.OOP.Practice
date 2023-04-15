package com.QAmp.HarisJasarevic.Projects.lesson3.encapsulation;


    //Encapsulation and inheritance practice

public class AnimalMain {
    public static void main(String[] args) {

        final Animal animal = new Animal("Turtle");
        final Dog dog = new Dog("Rex", 4);

        animal.makeSound();
        dog.makeSound();




    }
}
