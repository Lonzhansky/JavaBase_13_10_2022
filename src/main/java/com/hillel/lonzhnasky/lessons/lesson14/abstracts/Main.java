package com.hillel.lonzhnasky.lessons.lesson14.abstracts;

import com.hillel.lonzhnasky.lessons.lesson14.abstracts.obstacles.Obstacle;
import com.hillel.lonzhnasky.lessons.lesson14.abstracts.obstacles.impl.ObstaclePool;
import com.hillel.lonzhnasky.lessons.lesson14.abstracts.obstacles.impl.ObstacleTrack;
import com.hillel.lonzhnasky.lessons.lesson14.abstracts.participants.Participant;
import com.hillel.lonzhnasky.lessons.lesson14.abstracts.participants.impl.Cat;
import com.hillel.lonzhnasky.lessons.lesson14.abstracts.participants.impl.Dog;
import com.hillel.lonzhnasky.lessons.lesson14.abstracts.participants.impl.Elephant;
import com.hillel.lonzhnasky.lessons.lesson14.abstracts.participants.impl.Fish;

public class Main {
    public static void main(String[] args) {

//        Participant participant = new Participant("sdfsdf");
//        participant.run();
//        Obstacle obstacle = new Obstacle();
//        obstacle.start(participant);

        Participant[] participants = {
                new Cat("cat1"),
                new Cat("cat2"),
                new Fish("fish1"),
                new Elephant("elephant1"),
                new Dog("dog1")
        };

        Obstacle[] obstacles = {
                new ObstaclePool(),
                new ObstacleTrack()
        };

        for (Obstacle obstacle : obstacles) {
            for (Participant participant : participants) {
                obstacle.start(participant);
            }
        }



//        Participant participant = new Participant("participant") {
//            @Override
//            public void swim() {
//                System.out.println("participant swim");
//            }
//
//            @Override
//            public void run() {
//                System.out.println("participant run");
//            }
//        };
//
//        participant.run();
//        participant.swim();
//
//
//        Participant participant2 = new Participant("participant") {
//            @Override
//            public void swim() {
//                System.out.println("sgsfdgfdg");
//            }
//
//            @Override
//            public void run() {
//                System.out.println("dfgfdgfdgfd");
//            }
//        };
//
//        participant2.run();
//        participant2.swim();
//
//
//        Obstacle obstacle = new Obstacle() {
//
//            @Override
//            public void start(Participant participant) {
//                System.out.println("dfgjkdhfkgbfgkj");
//            }
//        };
//
//        obstacle.start(participant);

//        Cat cat1 = new Cat("cat1");
//
//        Cat cat2 = new Cat("cat2") {
//            @Override
//            public void swim() {
//                System.out.println("lkfgnkefbgherbghevbr");
//            }
//        };
//
//        cat1.swim();
//        cat2.swim();
//
//        cat1.run();
//        cat2.run();

    }
}
