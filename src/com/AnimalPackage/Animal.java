package com.AnimalPackage;

abstract class Animal implements Comparable<Animal>  {

    // implements Comparable<Animal>
    String name;
    int age;


    @Override
    public int compareTo(Animal o) {
        if(this.age == o.age){


            return 0;
        }

        else if(this.age > o.age){

            return 1;
        }

        else{

            return -1;
        }
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return " " +this.name + " : " + this.age + " ";
    }

    public abstract String sayHello();

    public abstract String move();
} // end of class Animal
