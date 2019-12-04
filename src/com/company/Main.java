package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Plane plane = new Plane();
        Car car = new Car();
        Ship ship = new Ship();
        Truck truck = new Truck();
        RaceCar raceCar = new RaceCar();


        Vehicle[] vehicles = {vehicle,plane,car,ship,truck,raceCar};

        for (Vehicle v: vehicles){
            if (v instanceof RaceCar){
                ((RaceCar) v).przypieszenie();
                ((RaceCar) v).uruchomSilnik();
            }
            else if (v instanceof  Truck){
                ((Truck) v).uruchomSilnik();
                ((Truck) v).superMoc();
            }
            else if (v instanceof Plane)
            {((Plane) v).fly();}
            else if (v instanceof Car){
                ((Car) v).uruchomSilnik();
                            }
            else if (v instanceof  Ship){
                ((Ship) v).uruchomSilniki();
            }
                        v.go();
        }

    }
}