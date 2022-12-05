package com.hillel.lonzhnasky.lessons.lesson13;

public class Cat extends Animal implements Runnable {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void run() {
        System.out.println(getName() + " run");
    }
}
