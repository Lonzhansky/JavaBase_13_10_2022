package com.hillel.lonzhnasky.test;

import com.hillel.lonzhnasky.lessons.lesson12.Car;
import com.hillel.lonzhnasky.lessons.lesson12.CarDVS;

public class Main {
    public static void main(String[] args) {
        CarChildTest carChildTest = new CarChildTest("sdf", 1.1);

        carChildTest.test();


        // ERROR
//        Car car = new Car("sdf", 1.1);
//        car.demo();

        CarDVS carDVS = new CarDVS("sdf", 1.1, 22);
        carDVS.demo();

    }
}
