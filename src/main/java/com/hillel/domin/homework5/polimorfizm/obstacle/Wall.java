package com.hillel.domin.homework5.polimorfizm.obstacle;

import com.hillel.domin.homework5.polimorfizm.pasipent.Patisipent;

public class Wall extends Obsacle {

    private int hight;

    public Wall(int hight) {
        this.hight = hight;
    }

    @Override
    public void overcome(Patisipent pasipent) {
        if(pasipent.getMaxHight() > hight){
            pasipent.jump();
        }else{
            System.out.println(pasipent.getName() + " did not over came the wall");
        }
    }
}
