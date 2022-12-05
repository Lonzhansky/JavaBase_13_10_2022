package com.hillel.lonzhnasky.lessons.lesson13;

public interface ChildRunnable extends Runnable, Swimmable {

    void childRun();

    @Override
    default void conflictMethod() {
        Runnable.super.conflictMethod();
    }
}
