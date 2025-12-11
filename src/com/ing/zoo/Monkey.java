package com.ing.zoo;

import java.util.Random;

public class Monkey implements Animal, Herbivore, TrickPerformer {
    private String name;
    private String helloText;
    private String eatText;
    private String trick;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        helloText = "oe oe aa aa";
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves() {
        eatText = "munch munch banana leaf";
        System.out.println(eatText);
    }

    @Override
    public void performTrick() {
        Random random = new Random();
        trick = random.nextBoolean() ? "swings through the trees" : "steals your hat";
        System.out.println(trick);
    }
}

