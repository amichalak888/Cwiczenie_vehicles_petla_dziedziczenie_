package com.company;

public class Truck extends Car {
    public Truck(String name) {
        super(name);
    }

    @Override
    public double getFuelNeeds() {
        return super.getFuelNeeds();
    }

    @Override
    public void uruchomSilnik() {
        //super.uruchomSilnik();
        System.out.println("Truck uruchamia silniki");

    }
    public void superMoc (){
        System.out.println("Truck uryuchamia turboprzyśpieszenie");
    }


}
