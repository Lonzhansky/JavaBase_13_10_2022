package com.hillel.lonzhnasky.lessons.lesson12;

public class CarDVS extends Car {

    double fuelBalance;

    public CarDVS(String modelName, double volumeEngine, double fuelBalance) {
        super(modelName, volumeEngine);
        this.fuelBalance = fuelBalance;
//        if (this.volumeEngine == 5.5) {
//            System.out.println("skjdfgoisdfosdij");
//        }


    }

    @Override
    public void demo() {
        super.demo();
    }

    void increaseFuelBank(double fuel) {
        fuelBalance += fuel;
    }

    void decreaseFuelBank(double fuel) {
        fuelBalance -= fuel;
    }


    @Override
    public void start() {
        startFuelPump();
        super.start();
    }


    void startFuelPump() {
        System.out.println("starting fuel pump");
    }
}
