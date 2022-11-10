package com.hillel.lonzhnasky.lessons.lesson7;

public class Homework8 {

    public static void main(String[] args) {

//        int counter = 0;
//        for (int i = 1; counter < 100; i++) {
//            if (i / 10 == 4 || i / 10 == 9 || i % 10 == 4 || i % 10 == 9
//                    || i / 100 == 4 || i / 100 == 9
//                    || i / 10 % 10 == 4 || i / 10 % 10 == 9 ) {
//                continue;
//            }
//
//            System.out.println("shuttle number: " + i);
//            counter++;
//        }
//        System.out.println(counter);

        int counter = 0;
        for (int i = 1; counter < 100; i++) {
            String stringNumber = String.valueOf(i);
            if (stringNumber.contains("4") || stringNumber.contains("9")) {
                continue;
            }
            System.out.println("shuttle number: " + i);
            counter++;
        }
        System.out.println(counter);

    }
}
