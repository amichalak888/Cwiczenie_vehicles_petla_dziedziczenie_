package com.company;

public class Plane extends  Vehicle implements Flying {
    public Plane(String name) {
        super(name);
    }

    @Override
    public void go() {
        //super.go();
        System.out.println("Plane rusza!");

    }

    @Override
    public double getFuelNeeds() {
        return 1111;
    }

    @Override
    public double getDistance() {
        return 1111111;
    }

    @Override
    public void takeOff() {
        System.out.println("Wylot samolotu");
    }

    @Override
    public void callAirControl() {
        System.out.println(" Kontorla!!! ");

    }

    @Override
    public void go1(Vehicle vehicle) {
        super.go();
        takeOff();

    }

    @Override
    public void stop(Vehicle vehicle) {
        super.stop(vehicle);


    }

    public void fly (){
        System.out.println("Samolot statruje ");
    }
}
