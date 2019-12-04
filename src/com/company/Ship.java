package com.company;

public class Ship extends Vehicle {
    @Override
    public void go() {
//        /super.go();
        System.out.println("Starek rusza");

    }
    public void uruchomSilniki (){
        System.out.println("Statek uchamia silniki!");
    }
}
