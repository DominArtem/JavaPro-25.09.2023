package com.hillel.domin.homework5.SquareFigure;

public class Round implements Area{

    private int radius;

    public Round(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double calculArea() {
        return (Math.PI * radius);

    }

}
