package com.hillel.lonzhnasky.lessons.lesson14.statics;

public class Main {
    public static void main(String[] args) {

        Demo demo = new Demo();

        System.out.println(demo.staticVariable);

        Demo.staticVariable = 11;

        System.out.println(Demo.staticVariable);

        Demo.staticVariable = 12;

        Demo.demoStaticMethod();

        System.out.println();
        System.out.println(demo.staticVariable);



    }
}
