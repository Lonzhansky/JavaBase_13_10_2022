package com.hillel.lonzhnasky.lessons.lesson14.statics;

public class Demo {

    public static int staticVariable = 10;
    public int nonStaticVariable = 10;

    public static void demoStaticMethod() {
        System.out.println(staticVariable);
        demoStaticMethod2();
    }

    public static void demoStaticMethod2() {
        System.out.println(staticVariable);
    }

    public void demoNonStaticMethod() {
        System.out.println(staticVariable);
    }
}
