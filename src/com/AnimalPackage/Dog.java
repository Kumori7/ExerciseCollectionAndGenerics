package com.AnimalPackage;

public class Dog extends Animal {
    public Dog(String name, int age){
        super(name, age);
    }

    @Override
    public String sayHello() {
        String output = super.getName() + " goes wuff!!";
        return output;
    }

    @Override
    public String move() {
        String output = super.getName() + " dog moves slowly!";
        return output;
    }

}// end of Dog class
