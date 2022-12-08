package com.hillel.lonzhnasky.lessons.lesson14.abstracts.participants;

public abstract class Participant {

    private String name;

    public Participant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void swim();

    public abstract void run();
}
