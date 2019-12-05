package com.company;


public class Main {

    public static void main(String[] args) {
        //Vehicle vehicle = new Vehicle();
        Plane plane = new Plane("samolot 1");
        Car car = new Car("auto 1");
        Ship ship = new Ship("statek 1");
        Truck truck = new Truck("Truck 1 ");
        RaceCar raceCar = new RaceCar("wyścigówka 1");


        Vehicle[] vehicles = {plane, car, ship, truck, raceCar};

//        for (Vehicle v : vehicles) {
//            if (v instanceof RaceCar) {
//                ((RaceCar) v).przypieszenie();
//                ((RaceCar) v).uruchomSilnik();
//            } else if (v instanceof Truck) {
//                ((Truck) v).uruchomSilnik();
//                ((Truck) v).superMoc();
//            } else if (v instanceof Plane) {
//                ((Plane) v).fly();
//            } else if (v instanceof Car) {
//                ((Car) v).uruchomSilnik();
//
//            } else if (v instanceof Ship) {
//                ((Ship) v).uruchomSilniki();
//            }
//            v.go();
//        }

        Vehicle[] vehicles1 = {plane, car, ship, truck, raceCar};
        for (Vehicle x : vehicles1) {
           x.go1(x);
            System.out.println(x.calculateFuelConsumption());

        }
        for (Vehicle y : vehicles
        ) {
            if (y instanceof Flying) {
                ((Flying) y).callAirControl();
            }
        }


    }
}
