package com.hillel.lonzhnasky.lessons.lesson14.main;

public class Car {

    private String modelName;
    private Door door = new Door();

    public static int counter = 0;

    public Car(String modelName) {
        this.modelName = modelName;
        counter++;

    }

    public void start() {
        System.out.println(modelName + " start");
        door.rollDown();
    }

    public void demoCar() {
        System.out.println(modelName);
        System.out.println(door.demoInt);

        {
            class LocalClass {
                String str = "sdfsdfsd";
            }

            LocalClass localClass = new LocalClass();
            System.out.println(localClass.str);
        }


    }



    public class Door {

        private int demoInt = 10;

        public void demoDoor() {
            System.out.println(modelName);
            System.out.println(counter);
        }

        public void rollDown() {

        }

        public void rollUp() {

        }

    }

    public static class StaticDoor {

        private int demoInt = 10;

        public void demoDoor() {
            System.out.println(counter);
        }

        public void rollDown() {

        }

        public void rollUp() {

        }

    }

}
