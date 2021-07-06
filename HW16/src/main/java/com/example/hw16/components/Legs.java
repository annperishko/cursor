package com.example.hw16.components;

import org.springframework.stereotype.Component;

@Component
public class Legs {

    public Legs() {
        System.out.println("Hands was created");
    }

    public void move() {
        System.out.println("Robot is moving");

    }
}
