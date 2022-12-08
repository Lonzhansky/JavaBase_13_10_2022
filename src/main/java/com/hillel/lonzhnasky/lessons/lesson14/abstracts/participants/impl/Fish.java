package com.hillel.lonzhnasky.lessons.lesson14.abstracts.participants.impl;

import com.hillel.lonzhnasky.lessons.lesson14.abstracts.participants.Participant;

public class Fish extends Participant {

    public Fish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(getName() + " start swim");
    }

    @Override
    public void run() {
        System.out.println(getName() + " cant run");
    }
}
