package com.company;

public class Plane extends  Vehicle {
    @Override
    public void go() {
        //super.go();
        System.out.println("Plane rusza!");

    }
    public void fly (){
        System.out.println("Samolot statruje ");
    }
}
