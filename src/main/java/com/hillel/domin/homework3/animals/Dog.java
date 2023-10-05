package com.hillel.domin.homework3.animals;

public class Dog extends Animals{

    private String name;
    private int distnseRun = 500;
    private int distnseSwim = 10;
    private static int countDog;
    private static int countRun;
    private static int countSwim;



    public Dog(String name, int distnseRun, int distnseSwim) {
        this.name = name;
        this.distnseRun = distnseRun;
        this.distnseSwim = distnseSwim;
        countDog++;
    }

    @Override
    public void animalRun() {
        if(distnseRun > 500) {
            System.out.println(name + " can't run that distance");
        }else if (distnseRun < 0){
            System.out.println("Distance error");
        }else{
            System.out.println(name + " running " + distnseRun +  " metrs");
            countRun++;
        }super.animalRun();

    }

    @Override
    public void animalSwim() {
        if (distnseSwim > 10) {
            System.out.println("Cats can't swim");
        }else if(distnseSwim < 0){
            System.out.println("Distance error");
        }else {
            System.out.println(name + " swimming " + distnseSwim +  " metrs");
            countSwim++;
        }super.animalSwim();

    }

    public static String getCounter(){
        return countDog + " dogs took part in the competition";
    }

    public static String getDog(){
        return countRun + " dogs running" + " " + countSwim + " dogs swimming";
    }


}
