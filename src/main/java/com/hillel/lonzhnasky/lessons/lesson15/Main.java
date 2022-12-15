package com.hillel.lonzhnasky.lessons.lesson15;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(Category.C);

        System.out.println(CarType.CAR);
        System.out.println(CarType.CAR.getType());

        System.out.println(Arrays.toString(CarType.values()));


        for (CarType value : CarType.values()) {
            System.out.println(value.getType());
        }


        System.out.println(CarType.valueOf("CAR"));


//        try {
//            CarType car = CarType.valueOf("CAR");
//            System.out.println(car);
//        } catch (IllegalArgumentException e) {
//            System.out.println("Wrong data!");
//        }


    }
}
