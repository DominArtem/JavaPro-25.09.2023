package com.hillel.domin.homework3;

import com.hillel.domin.homework3.animals.Animals;
import com.hillel.domin.homework3.animals.Cat;
import com.hillel.domin.homework3.animals.Dog;

public class Main {

    public static void main(String[] args) {


        Cat cat = new Cat("Kisa", 300, 5);
        Cat cat1 = new Cat("Pushok", 201, 0);
        Cat cat2 = new Cat("Mursik", -1, -1);

        Dog dog = new Dog("Patron", 120, 9);
        Dog dog1 = new Dog("Patron", 501, 12);
        Dog dog2 = new Dog("Patron", -1, -1);


        cat.animalRun();
        cat.animalSwim();
        System.out.println();
        cat1.animalRun();
        cat1.animalSwim();
        System.out.println();
        cat2.animalRun();
        cat2.animalSwim();
        System.out.println();

        dog.animalRun();
        dog.animalSwim();
        System.out.println();
        dog1.animalRun();
        dog1.animalSwim();
        System.out.println();
        dog2.animalRun();
        dog2.animalSwim();
        System.out.println();

        System.out.println(Animals.getCounter());
        System.out.println(Cat.getCounter());
        System.out.println(Dog.getCounter());

        System.out.println(Dog.getDog());
        System.out.println(Cat.getCat());

    }



}
