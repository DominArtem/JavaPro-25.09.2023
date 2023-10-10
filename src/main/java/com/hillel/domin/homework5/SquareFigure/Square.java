package com.hillel.domin.homework5.SquareFigure;

public class Square implements Area{


    private int length;
    public Square(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public double calculArea() {
        return (Math.pow(length, length));

    }


}
