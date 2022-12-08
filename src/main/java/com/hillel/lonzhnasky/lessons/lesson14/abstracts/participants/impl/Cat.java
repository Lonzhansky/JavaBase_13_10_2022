package com.hillel.lonzhnasky.lessons.lesson14.abstracts.participants.impl;

import com.hillel.lonzhnasky.lessons.lesson14.abstracts.participants.Participant;

public class Cat extends Participant {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(getName() + " cant swim");
    }

    @Override
    public void run() {
        System.out.println(getName() + " start run");
    }
}
