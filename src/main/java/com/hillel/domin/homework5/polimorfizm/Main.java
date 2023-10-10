package com.hillel.domin.homework5.polimorfizm;

import com.hillel.domin.homework5.polimorfizm.obstacle.Obsacle;
import com.hillel.domin.homework5.polimorfizm.obstacle.RaceTrack;
import com.hillel.domin.homework5.polimorfizm.obstacle.Wall;
import com.hillel.domin.homework5.polimorfizm.pasipent.Cat;
import com.hillel.domin.homework5.polimorfizm.pasipent.Human;
import com.hillel.domin.homework5.polimorfizm.pasipent.Patisipent;
import com.hillel.domin.homework5.polimorfizm.pasipent.Robot;

public class Main {

    public static void main(String[] args) {


        Patisipent[] patisipents = {
                new Cat(2,4, "Barsik"),
                new Cat(8,15,"Pushok"),
                new Robot(6,8,"Volkswagen"),
                new Robot(9,1, "Irobot"),
                new Human(7,6, "Adam"),
                new Human(5,4, "Eva")
        };

        Obsacle[] obsacles = {
                new RaceTrack(1),
                new Wall(1)
        };

        for (Patisipent patisipent: patisipents) {
            System.out.println();
            for (Obsacle obsacle: obsacles) {
                obsacle.overcome(patisipent);
            }

        }





    }
}
