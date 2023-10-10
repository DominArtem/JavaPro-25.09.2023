package com.hillel.domin.homework5.polimorfizm.obstacle;

import com.hillel.domin.homework5.polimorfizm.pasipent.Patisipent;

public class RaceTrack extends Obsacle {

      private int lenght;

    public RaceTrack(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public void overcome(Patisipent pasipent) {
        if(pasipent.getMaxHight() > lenght){
            pasipent.run();
        }else{
            System.out.println( pasipent.getName() + " did not over came the run");
        }
    }
}
