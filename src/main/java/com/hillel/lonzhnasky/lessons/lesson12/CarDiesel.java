package com.hillel.lonzhnasky.lessons.lesson12;

public class CarDiesel extends CarDVS {

    String dieselMark;

    public CarDiesel(String modelName, double volumeEngine, double fuelBalance) {
        super(modelName, volumeEngine, fuelBalance);
    }

    @Override
    public void start() {
        super.startFuelPump();
        System.out.println("START!");
    }
}
