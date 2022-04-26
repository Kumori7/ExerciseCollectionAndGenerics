package com.AnimalPackage;

public class Rabbit extends Animal {
    public Rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public String sayHello() {
        String output = super.getName() + " says squeak!!";
        return output;
    }

    @Override
    public String move() {
        String output = super.getName() + " moves in the grass silently ";
        return output;
    }
} // end of Rabbit class
