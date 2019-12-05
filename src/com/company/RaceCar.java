package com.company;

public class RaceCar extends Car {
    public RaceCar(String name) {
        super(name);
    }

    @Override
    public void uruchomSilnik() {
        //super.uruchomSilnik();
        System.out.println("Race Car uruchamia silniki");

    }
    public void przypieszenie()
    {
        System.out.println("RaceCar uruchamia przyśpieszenie!");
    }

    @Override
    public double getFuelNeeds() {
        return super.getFuelNeeds();
    }
}
