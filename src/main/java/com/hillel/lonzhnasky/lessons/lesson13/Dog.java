package com.hillel.lonzhnasky.lessons.lesson13;

public class Dog extends Animal implements Runnable, Swimmable, Cloneable {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void run() {
        System.out.println(getName() + " run");
    }

    @Override
    public void defaultRun() {
        System.out.println("test override");
    }

    @Override
    public void conflictMethod() {
//        Runnable.super.conflictMethod();
        Swimmable.super.conflictMethod();
//        System.out.println("my realization");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " swim");
    }



}
