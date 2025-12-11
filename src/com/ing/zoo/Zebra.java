package com.ing.zoo;

import java.util.Random;

public class Zebra implements Animal, Herbivore {
    private String name;
    private String helloText;
    private String eatText;

    public Zebra()
    {
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sayHello()
    {
        helloText = "zebra zebra";
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves()
    {
        eatText = "munch munch zank yee bra";
        System.out.println(eatText);
    }
}
