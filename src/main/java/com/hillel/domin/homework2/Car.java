package com.hillel.domin.homework2;

public class Car {

    public void start(){

        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startFuelSystem() {
        System.out.println("startFuelSystem");
    }

    private void startCommand() {
        System.out.println("startCommand");

    }

    private void startElectricity() {
        System.out.println("startElectricity");

    }
}
