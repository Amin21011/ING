package com.ing.zoo;

public class Giraffe implements Animal, Herbivore {
    private String name;
    private String helloText;
    private String eatText;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        helloText = "humble neck stretch and hello";
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves() {
        eatText = "munch munch high leaves";
        System.out.println(eatText);
    }
}

