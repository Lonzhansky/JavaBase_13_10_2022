package com.hillel.lonzhnasky.test;

import com.hillel.lonzhnasky.lessons.lesson12.Car;

public class CarChildTest extends Car {
    public CarChildTest(String modelName, double volumeEngine) {
        super(modelName, volumeEngine);
    }

    protected void test() {
        demo();
    }


}
