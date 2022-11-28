package com.hillel.lonzhnasky.lessons.lesson11;

public class Person {

    // global variable
    String name;
    int age;


    public Person(String name, int age) {
        this.age = age;
        this.name = name;
        System.out.println(this);
    }

//    public Person(String name) {
//        this(name, 99);
//    }
//
//    public Person(int age) {
//        this("qwerty", age);
//    }

    public Person(String name) {
        this.name = name;
    }


    public Person() {
    }

    void demo() {
        // local variable
        int x = 10;
        System.out.println("x = " + x);
    }

    void sayHello() {
        System.out.println(name + " say hello");
    }

    void printAge() {
        System.out.println("age = " + age);
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
