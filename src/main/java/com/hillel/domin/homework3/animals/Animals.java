package com.hillel.domin.homework3.animals;

public class Animals {

    private static int counter;

    public Animals(){
        counter++;
    }

    public static String getCounter(){
        return counter + " Animals took part in the competition";
    }

    public void animalRun(){
    }

    public void animalSwim(){
    }



}
