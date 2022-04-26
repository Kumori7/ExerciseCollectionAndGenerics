package com.AnimalPackage;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String sayHello() {
        //String output = this.name + " says Meow!!!!";
        String output = super.getName() + " says Meow!!!!";
        return output;
    }

    @Override
    public String move() {
        String output = super.getName() + " move fast!!";
        return output;
    }


} // end of Cat class
