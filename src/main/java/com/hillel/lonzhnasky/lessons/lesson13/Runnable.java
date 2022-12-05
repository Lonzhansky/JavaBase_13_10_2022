package com.hillel.lonzhnasky.lessons.lesson13;

public interface Runnable {

    int DISTANCE = 100;

    void run();


    default void defaultRun() {
        System.out.println("defaultRun");
    }

    default void conflictMethod() {
        System.out.println("From Runnable");
    }

}
