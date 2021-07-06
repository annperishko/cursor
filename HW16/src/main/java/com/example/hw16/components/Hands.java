package com.example.hw16.components;

import org.springframework.stereotype.Component;

@Component
public class Hands {

    public Hands() {
        System.out.println("Hands was created");
    }

    public void push() {
        System.out.println("Robot is pushing");

    }
}
