package com.ing.zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args)
    {
        final String Hello = "hello";
        final String Leaves = "give leaves";
        final String Meat = "give meat";
        final String Trick = "perform trick";

        Lion henk = new Lion(); henk.setName("henk");
        Hippo elsa = new Hippo(); elsa.setName("elsa");
        Pig dora = new Pig(); dora.setName("dora");
        Tiger wally = new Tiger(); wally.setName("wally");
        Zebra marty = new Zebra(); marty.setName("marty");
        Giraffe geoffrey = new Giraffe(); geoffrey.setName("geoffrey");
        Monkey chacha = new Monkey(); chacha.setName("chacha");

        List<Animal> animals = new ArrayList<>();
        animals.add(henk);
        animals.add(elsa);
        animals.add(dora);
        animals.add(wally);
        animals.add(marty);
        animals.add(geoffrey);
        animals.add(chacha);

        List<Herbivore> herbivores = new ArrayList<>();
        herbivores.add(elsa);
        herbivores.add(dora);
        herbivores.add(marty);
        herbivores.add(geoffrey);
        herbivores.add(chacha);

        List<Carnivore> carnivores = new ArrayList<>();
        carnivores.add(henk);
        carnivores.add(dora);
        carnivores.add(wally);

        List<TrickPerformer> performers = new ArrayList<>();
        performers.add(dora);
        performers.add(wally);
        performers.add(chacha);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine().trim();
        String lower = input.toLowerCase(Locale.ROOT);

        if(lower.startsWith(Hello))
        {
            String[] parts = lower.split(" ", 2);
            if(parts.length == 1)
            {
                for (Animal animal : animals) {
                    animal.sayHello();
                }
            }
            else
            {
                String requestedName = parts[1].trim();
                Animal found = null;
                for (Animal animal : animals) {
                    if(animal.getName().equalsIgnoreCase(requestedName)) {
                        found = animal;
                        break;
                    }
                }
                if(found != null) {
                    found.sayHello();
                } else {
                    System.out.println("Unknown animal: " + requestedName);
                }
            }
        }
        else if(lower.equals(Leaves))
        {
            for (Herbivore herbivore : herbivores) {
                herbivore.eatLeaves();
            }
        }
        else if(lower.equals(Meat))
        {
            for (Carnivore carnivore : carnivores) {
                carnivore.eatMeat();
            }
        }
        else if(lower.equals(Trick))
        {
            for (TrickPerformer performer : performers) {
                performer.performTrick();
            }
        }
        else
        {
            System.out.println("Unknown command: " + input);
        }
    }
}
