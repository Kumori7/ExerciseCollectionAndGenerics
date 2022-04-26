package com.AnimalPackage;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Cat c1 = new Cat("Dolphin", 1);
        Cat c2 = new Cat("Mr Cat", 6);

        Dog d1 = new Dog("Felix", 8);
        Dog d2 = new Dog("George", 16);

        Rabbit r1 = new Rabbit("Hacker", 3);

        ArrayList<Animal> animalArrayList = new ArrayList<>();
        animalArrayList.add(c1);
        animalArrayList.add(c2);
        animalArrayList.add(d1);
        animalArrayList.add(d2);
        animalArrayList.add(r1);

        //System.out.println("animalArrayList: " + animalArrayList);

        HashMap<String, Animal> map = new HashMap<>();
        map.put(c1.getName(), c1);
        map.put(c2.getName(), c2);

        //System.out.println("map " + map);

        HashMap<Animal, String> map2 = new HashMap<>();

        map2.put(c1, c1.toString());
        map2.put(c2, c2.toString());
        //System.out.println("map2 " + map2);

        //Q4 a

        HashSet<Animal> set = new HashSet<>();
        set.add(c1);
        set.add(c1);
        set.add(c2);
        set.add(d1);
        set.add(d2);
        set.add(r1);

        //System.out.println("set: "+ set);

        //Q5

        for (int i = 0; i < animalArrayList.size(); i++) {
            //System.out.println(animalArrayList.get(i));
        }

        for (Animal a : set) {
            //  System.out.println(a);
        }

        Iterator<Animal> it =  set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        //Q6
        System.out.println(map.containsKey("Dolphin"));

        //Q7

        //animalArrayList.sort();



    } // end of main method
} //end of Main method
