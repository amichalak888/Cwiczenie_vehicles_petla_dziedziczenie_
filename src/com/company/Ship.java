package com.company;

public class Ship extends Vehicle implements Sailing{

    public Ship(String name) {
        super(name);
    }

    @Override
    public double getFuelNeeds() {
        return 2;
    }

    @Override
    public double getDistance() {
        return 4;
    }

    @Override
    public void go() {
//        /super.go();
        System.out.println("Starek rusza");

    }
    public void uruchomSilniki (){
        System.out.println("Statek uchamia silniki!");
    }

    @Override
    public void stop(Vehicle vehicle) {
        //super.stop(ship);
        dock();
    }

    @Override
    public void dock() {
        System.out.println("Statek przybył do portu");

    }
}
