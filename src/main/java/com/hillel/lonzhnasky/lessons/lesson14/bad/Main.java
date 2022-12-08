package com.hillel.lonzhnasky.lessons.lesson14.bad;

import com.hillel.lonzhnasky.lessons.lesson14.bad.obstacles.ObstaclePool;
import com.hillel.lonzhnasky.lessons.lesson14.bad.obstacles.ObstacleTrack;
import com.hillel.lonzhnasky.lessons.lesson14.bad.participants.Cat;
import com.hillel.lonzhnasky.lessons.lesson14.bad.participants.Elephant;
import com.hillel.lonzhnasky.lessons.lesson14.bad.participants.Fish;

public class Main {
    public static void main(String[] args) {

        ObstaclePool obstaclePool = new ObstaclePool();
        ObstacleTrack obstacleTrack = new ObstacleTrack();

        Cat cat = new Cat("cat1");
//        Dog dog = new Dog("dog1");
        Fish fish = new Fish("fish1");
        Elephant elephant = new Elephant("elephant");

        obstaclePool.start(cat);
//        obstaclePool.start(dog);
        obstaclePool.start(fish);
        obstaclePool.start(elephant);

        obstacleTrack.start(cat);
//        obstacleTrack.start(dog);
        obstacleTrack.start(fish);
        obstacleTrack.start(elephant);

    }
}
