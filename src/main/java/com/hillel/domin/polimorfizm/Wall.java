package com.hillel.domin.polimorfizm;

public class Wall extends Obsacle {

    private int hight;

    public Wall(int hight) {
        this.hight = hight;
    }

    @Override
    public void overcome(Pasipent pasipent) {
        if(pasipent.getMaxHight() > hight){
            pasipent.jump();
        }else{
            System.out.println( pasipent.getName() + " did not over came the wall");
        }
    }
}
