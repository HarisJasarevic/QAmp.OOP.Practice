package com.QAmp.HarisJasarevic.Projects.lesson3.assignment;

    //Encapsulation and inheritance practice

public class AssignmentMain {
    public static void main(String[] args) {

        final  Bicycle bicycle = new Bicycle();
        final ElectricBike electricBike = new ElectricBike(2, new ElectricEngine());

        bicycle.speedUp(50);
        System.out.println(bicycle.toString());
        System.out.println(electricBike.toString());

        electricBike.speedUp(50);
        System.out.println(electricBike.toString());



    }
}
