package com.hillel.lonzhnasky.lessons.lesson14.abstracts.obstacles.impl;

import com.hillel.lonzhnasky.lessons.lesson14.abstracts.obstacles.Obstacle;
import com.hillel.lonzhnasky.lessons.lesson14.abstracts.participants.Participant;

public class ObstacleTrack implements Obstacle {

    @Override
    public void start(Participant participant) {
        participant.run();
    }
}
