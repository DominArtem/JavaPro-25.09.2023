package com.hillel.domin.homework3.animals;

public class Cat extends Animals {

    private String name;
    private int distnseRun = 200;
    private int distnseSwim = 0;
    private static int countCat;
    private static int countRun;
    private static int countSwim;




    public Cat(String name, int distnseRun, int distnseSwim) {
        this.name = name;
        this.distnseRun = distnseRun;
        this.distnseSwim = distnseSwim;
        countCat++;
    }

    @Override
    public void animalRun() {
        if(distnseRun > 200) {
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
        if (distnseSwim > 0) {
            System.out.println("Cats can't swim");
        }else if(distnseSwim < 0){
            System.out.println("Distance error");
        }else {
            System.out.println("The cat finished the competition");
            countSwim++;
        }super.animalSwim();
    }

    public static String getCounter(){
        return countCat + " сats took part in the competition";
    }

    public static String getCat(){
        return countRun + " Cat running" + " " + countSwim + " Cat swimming";
    }


}

