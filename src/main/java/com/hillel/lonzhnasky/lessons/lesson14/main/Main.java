package com.hillel.lonzhnasky.lessons.lesson14.main;

public class Main {
    public static void main(String[] args) {


        Car car = new Car("BMW");
        Car car2 = new Car("BMW");
        Car car3 = new Car("BMW");
        Car car4 = new Car("BMW");
//        System.out.println(car.modelName);

        System.out.println(Car.counter);

        Car.StaticDoor door = new Car.StaticDoor();
        door.demoDoor();


    }
}
