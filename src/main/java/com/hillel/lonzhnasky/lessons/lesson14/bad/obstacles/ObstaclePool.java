package com.hillel.lonzhnasky.lessons.lesson14.bad.obstacles;

import com.hillel.lonzhnasky.lessons.lesson14.bad.participants.Cat;
import com.hillel.lonzhnasky.lessons.lesson14.bad.participants.Elephant;
import com.hillel.lonzhnasky.lessons.lesson14.bad.participants.Fish;

public class ObstaclePool {

    public void start(Cat cat) {
        System.out.println(cat.getName() + " start swim");
    }

//    public void start(Dog dog) {
//        System.out.println(dog.getName() + " start swim");
//    }

    public void start(Fish fish) {
        System.out.println(fish.getName() + " start swim");
    }

    public void start(Elephant elephant) {
        System.out.println(elephant.getName() + " start swim");
    }

}
