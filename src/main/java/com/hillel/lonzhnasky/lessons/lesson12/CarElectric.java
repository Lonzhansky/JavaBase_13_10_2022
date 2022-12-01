package com.hillel.lonzhnasky.lessons.lesson12;

public class CarElectric extends Car {

    double powerBalance;

    public CarElectric(String modelName, double volumeEngine) {
        super(modelName, volumeEngine);
    }

    void increasePowerBank(double power) {
        powerBalance += power;
    }

    void decreasePowerBank(double power) {
        powerBalance -= power;
    }

}
