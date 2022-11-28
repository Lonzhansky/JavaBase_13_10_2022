package com.hillel.lonzhnasky.lessons.lesson10;

public class Main {
    public static void main(String[] args) {
//        demoMethod();
//
//        printGreeting("Den");
//        printGreeting("Alex");
//
//        int number = 5;
//        changeValueVariable(number);
//        System.out.println(number);

//        int a = 10;
//        int b = 5;
//        int sum = sum(a, b);
//
//        System.out.println(sum);
//
//        System.out.println(sum(4, 8));
//
//
//        int result = sum(getNumber1(), getNumber2());
//        System.out.println(result);


//        doSomething(99F);
//
//        doSomething(10, 5, 10.999);

//        badDemoRecursion();


        // 5! = 1 * 2 * 3 * 4 * 5;

//        int result = 1;
//        for (int i = 1; i <= 5; i++) {
//            result *= i;
//        }
//
//        System.out.println(result);


//        int result = getFactorial(5);
//        System.out.println(result);


//        demoRecursion(1);

        getFactorial(5);

    }





    static void demoRecursion(int x) {
        if (x == 5) {
            return;
        }

        System.out.println(x);

        demoRecursion(++x);

        System.out.println(x);

    }


    // 5 * 4 * 3 * 2 * 1
    static int getFactorial(int N) {
        if (N == 1) {
            return 1;
        }
        return N * getFactorial(N - 1);
    }

    // BAD RECURSION!!!!!!!!!!!!!!!!!!!!!!1
    static void badDemoRecursion() {
        System.out.println("sdfdsaf");
        badDemoRecursion();
    }

    static void demoReturn(int x) {

        if (x == 2) {
            return;
        }
        System.out.println("dfgfg");
        System.out.println("dfgfg");
        System.out.println("dfgfg");
        System.out.println("dfgfg");
        System.out.println("dfgfg");

    }

    static void doSomething() {
        System.out.println("i do something 1");
    }

    static void doSomething(int x) {
        System.out.println("i do something 2");
    }

    static void doSomething(int x1, int x2) {
        System.out.println("i do something 3");
    }

    static void doSomething(int x1, int x2, int x3) {
        System.out.println("i do something 4");
    }

    static void doSomething(int x1, int x2, double x3) {
        System.out.println("i do something 5");
    }

    static int doSomething(float x1) {
        System.out.println("i do something 5");
        return 1;
    }


    static void changeValueVariable(int number) {
        number += 10;
        System.out.println("number from method " + number);
    }

    static int sum(int number1, int number2) {
        int result = number1 + number2;
        return result;
    }

    static int getNumber1() {
        return 10;
    }

    static int getNumber2() {
        return getNumber3();
    }

    static int getNumber3() {
        return 33;
    }


    static void demoMethod() {
        System.out.println("Hello World");
        System.out.println("Hello World");
    }


    static void printGreeting(String name) {
        System.out.println("Hello " + name);
    }




}
