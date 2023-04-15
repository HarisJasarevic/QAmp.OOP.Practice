package com.QAmp.HarisJasarevic.Projects.lesson3.assignment;

public class ElectricEngine {

    private double battery;

    public ElectricEngine () {
        this.battery = 200;
    }

    public void batteryDischarge (final double value) {
        this.battery -= value;
    }

    public double getBattery () {
        return this.battery;
    }
}
