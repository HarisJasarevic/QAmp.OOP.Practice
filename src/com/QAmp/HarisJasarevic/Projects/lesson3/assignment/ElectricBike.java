package com.QAmp.HarisJasarevic.Projects.lesson3.assignment;

public class ElectricBike extends Velocipede {

    private ElectricEngine engine;

    public ElectricBike (final int tires, final ElectricEngine engine) {
        super(tires);
        this.engine = engine;
    }

    @Override
    public double speedUp(final double speed) {
        this.speed += 2 * speed;
        this.engine.batteryDischarge(0.1 * speed);
        return speed;
    }

    @Override
    public String toString () {
        return super.toString() + ", battery capacity: " + this.engine.getBattery();
    }
}
