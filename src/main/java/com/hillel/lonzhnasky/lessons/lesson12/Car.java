package com.hillel.lonzhnasky.lessons.lesson12;

public class Car {

    // default / package-private
    private String modelName;
    private double volumeEngine;

    public Car(String modelName, double volumeEngine) {
        this.modelName = modelName;
        this.volumeEngine = volumeEngine;
    }

    public Car(String modelName) {
       this(modelName, 2.2);
    }


    protected void demo() {
        System.out.println("Demo");
    }

    public void start() {
        startElectronicSystem();
        startFuelSystem();
        startGPSSystem();
    }

    protected void stop() {
        System.out.println("STOP");
    }


    private void startFuelSystem() {
        System.out.println("starting fuel system...");
    }

    private void startElectronicSystem() {
        System.out.println("starting electronic system...");
    }

    private void startGPSSystem() {
        System.out.println("starting GPS system...");
    }

    public String getModelName() {
        return modelName;
    }

    public double getVolumeEngine() {
        return volumeEngine;
    }

    public void setVolumeEngine(double volumeEngine) {
        this.volumeEngine = volumeEngine;
    }
}
