package com.hillel.lonzhnasky.lessons.lesson5;

public class Homework {
    public static void main(String[] args) {
        int warriors = 13;
        int archers = 24;
        int horseMans = 46;

        int countLi = 860;

        final double COEFFICIENT = 1.5;


        int sumLi = (warriors * countLi) + (archers * countLi) + (horseMans * countLi);
        int sumLi2 = (warriors + archers + horseMans) * countLi;
        double countMin = countLi * COEFFICIENT;

    }
}
