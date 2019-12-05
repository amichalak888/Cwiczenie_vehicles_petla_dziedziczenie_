package com.company;

public abstract class Vehicle {
    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public void go (){ System.out.println("Vehicle rusza");
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';

    }
    public abstract double getFuelNeeds ();
    public abstract double getDistance ();
    public double calculateFuelConsumption (){
        return getDistance()/getFuelNeeds();
    };

    public  void  go1(Vehicle vehicle){
        System.out.println("Jedz "+vehicle.getClass().getName());
    }

    public void  stop (Vehicle vehicle){
        System.out.println("Stop "+vehicle.getClass().getName());
    }
}
