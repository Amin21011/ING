package com.ing.zoo;

public class Hippo implements Animal, Herbivore {
    private String name;
    private String helloText;
    private String eatText;

    public Hippo()
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
        helloText = "splash";
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves()
    {
        eatText = "munch munch lovely";
        System.out.println(eatText);
    }
}
