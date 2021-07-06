package com.example.hw16.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Robot {
    private final Hands hands;
    private final Legs legs;
    private final Head head;

    @Autowired
    public Robot(Hands hands, Legs legs, Head head) {
        this.hands = hands;
        this.head = head;
        this.legs = legs;
        System.out.println("Robot was created");
        robotMove();
        robotPush();
        robotThink();
    }

    public void robotMove() {
        legs.move();
    }

    public void robotPush() {
        hands.push();
    }

    public void robotThink() {
        head.think();
    }
}
