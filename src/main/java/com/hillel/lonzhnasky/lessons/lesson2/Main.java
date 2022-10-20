package com.hillel.lonzhnasky.lessons.lesson2;

public class Main {

    public static void main(String[] args) {

        // цiлочисельнi
        byte myAge;

        myAge = -128;
        System.out.println(myAge);

        myAge = 127;
        System.out.println(myAge);

        short length = 32000;

        int someInteger1 = 2_000_000_000;
        int someInteger2 = 2000000000;

        System.out.println(someInteger1);
        System.out.println(someInteger2);


        long someLong = 20000000001L;


        System.out.println();
        System.out.println();

        // дробовi
        float volume = 11.1234567890123456F;
        System.out.println(volume);

        double someDoubleVariable = 11.1234567890123456;
        System.out.println(someDoubleVariable);

        System.out.println();
        System.out.println();
        // символи
        char categoryDriverLicense1 = 'A';
        char categoryDriverLicense2 = 65;
        char categoryDriverLicense3 = '\uFFFF';

        System.out.println(categoryDriverLicense1);
        System.out.println(categoryDriverLicense2);
        System.out.println(categoryDriverLicense3);


        System.out.println();
        System.out.println();

        // логiчний
        boolean isCat = false;
        boolean isDog = true;

        System.out.println();
        System.out.println();


        //---------------------------------------------------------------------------//


//        byte age = 28;
//        int bigAge = age;
//        System.out.println(bigAge);


        char charA = 'A';
        int integerA = charA;
        System.out.println(integerA);


        // ERROR!!!!
//        boolean demoBoolean = integerA;
//
//        integerA = demoBoolean;


        System.out.println();
        System.out.println();

        long bigAge = 334534534534534543L;
        byte age = (byte) bigAge;
        System.out.println(age);


        long long2 = age;

        System.out.println(long2);

        System.out.println();
        System.out.println();
        System.out.println();



//        double applePriceDouble = 54.88;
//
//        int applePriceInt = (int) applePriceDouble;
//
//        System.out.println(applePriceInt);


        int applePriceInt = 54;
        double applePriceDouble = applePriceInt;


        System.out.println(applePriceDouble);


        // Референсний
        String name = "Denys";
        String name2 = "Denys";
        String name3 = "Denys";


        String str = "age = " + 28 + 12;

        System.out.println(str);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();



    }

}
