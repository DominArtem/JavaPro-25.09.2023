package com.hillel.domin.polimorfizm;

public class Pasipent {

    private int maxLenghts;
    private int maxHight;

    private String name;


    public Pasipent(int maxLenghts, int maxHight, String name) {
        this.maxLenghts = maxLenghts;
        this.maxHight = maxHight;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getMaxLenghts() {
        return maxLenghts;
    }

    public int getMaxHight() {
        return maxHight;
    }


    public void jump(){
        System.out.println("jumping");
    }
   public void run(){
       System.out.println("running");
   }



}
