package com.hillel.domin.homework5.SquareFigure;

public class Triangle implements Area{

    private int length;
    private int hight;

    public Triangle(int length, int hight) {
        this.length = length;
        this.hight = hight;
    }

    public int getLength() {
        return length;
    }

    public int getHight() {
        return hight;
    }

    @Override
    public double calculArea() {
        return  (0.5 * length * hight);
    }


}
