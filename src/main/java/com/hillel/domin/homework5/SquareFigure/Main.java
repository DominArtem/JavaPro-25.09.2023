package com.hillel.domin.homework5.SquareFigure;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {



        Area[] area = {
                new Triangle(5,5),
                new Round(8),
                new Square(2)
        };
        

        for (Area b: area) {
            System.out.println(b.calculArea());
        }

        double totalArea = calculateTotalArea(area);
        System.out.println("Total area of all figures: " + totalArea);

    }
    public static double calculateTotalArea(Area[] area) {
        double totalArea = 0.0;
        for (Area areas : area) {
            totalArea += areas.calculArea();
        }
        return totalArea;
    }
}
