package com.hillel.domin.polimorfizm;

public class Main {

    public static void main(String[] args) {


        Pasipent pasipent = new Pasipent(12, 4, "human");

        Wall wall = new Wall(5);

        wall.overcome(pasipent);



    }
}
