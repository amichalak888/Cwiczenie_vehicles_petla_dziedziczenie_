package com.company;

public class Car extends Vehicle {

    public Car(String name) {
        super(name);
    }

    @Override
    public void go() {
//        super.go();
        System.out.println("Auto rusza!");
    }

    @Override
    public  double getFuelNeeds() {
        return 5.3;
    }

    @Override
    public double getDistance() {
        return 800;
    }

    public void uruchomSilnik(){
            System.out.println("Auto uruchamia silnik!");
        }
            }

