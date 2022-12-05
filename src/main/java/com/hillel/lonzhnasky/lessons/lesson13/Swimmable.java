package com.hillel.lonzhnasky.lessons.lesson13;

public interface Swimmable {

    void swim();

    default void conflictMethod() {
        System.out.println("From Swimmable");
    }

}
