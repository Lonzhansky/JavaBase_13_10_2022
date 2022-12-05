package com.hillel.lonzhnasky.lessons.lesson13;

public class Main {
    public static void main(String[] args) {

//        Animal animal = new Animal("Animal1", 7);
//        animal.sayHello();
//
//
//        Cat cat = new Cat("Tom", 11);
//        cat.run();
//
//        Dog dog = new Dog("Sharik", 9);
//        dog.swim();


//        Animal cat = new Cat("Tom", 9);
//        Animal dog1 = new Dog("Sharik1", 9);
//        Runnuble dog2 = new Dog("Sharik1", 9);
//        Swimmable dog3 = new Dog("Sharik1", 9);

//        demo(cat);
//        System.out.println();
//        demo(dog1);


//        if (dog2 instanceof Dog) {
//            ((Dog) dog2).sayHello();
//            dog2.run();
//            ((Dog) dog2).swim();
//        }

//        System.out.println(dog2.getClass());
//
//        if (dog2.getClass() == Dog.class) {
//            ((Dog) dog2).swim();
//        }


//        // ERROR!
//        Dog animal1 = new Animal("sdfds", 99);


//        Animal dog = null;
        //NPE
//        ((Runnuble) dog).run();


//        if (dog != null) {
//            ((Runnuble) dog).run();
//        }


        Dog dog = new Dog("Sharik1", 9);
//        dog.defaultRun();
        dog.conflictMethod();


        System.out.println(Runnable.DISTANCE);


    }


    static void demo(Animal animal) {
        if (animal != null) {
            animal.sayHello();

            if (animal instanceof Runnable) {
                ((Runnable) animal).run();
            }
            if (animal instanceof Swimmable) {
//            Swimmable swimmable = (Swimmable) animal;
//            swimmable.swim();
                ((Swimmable) animal).swim();
            }

            if (animal instanceof Dog) {
                Dog dog = (Dog) animal;
                dog.sayHello();
                dog.run();
                dog.swim();

//            animal.sayHello();
//            ((Dog) animal).run();
//            ((Dog) animal).swim();
            }
        }

    }


//    //BAD VERSION
//    static void demoDog(Dog dog) {
//        dog.sayHello();
//        dog.swim();
//    }
//    //BAD VERSION
//    static void demoCat(Cat cat) {
//        cat.sayHello();
//        cat.run();
//    }

}
