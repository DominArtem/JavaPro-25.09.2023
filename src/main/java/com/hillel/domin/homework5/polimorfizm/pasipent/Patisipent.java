package com.hillel.domin.homework5.polimorfizm.pasipent;

public class Patisipent {

    private int maxLenghts;
    private int maxHight;

    private String name;


    public Patisipent(int maxLenghts, int maxHight, String name) {
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
        System.out.println(name + " passed the barrier of the wall" + " at a distance: " + getMaxHight());
    }
   public void run(){
       System.out.println(name + " passed the treadmill hurdle" + " at a distance: " + getMaxLenghts());
   }





}
