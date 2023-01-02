package com.solvd.models;

import com.solvd.interfaces.ICar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Car extends Vehicle implements ICar {
    //final variable
    final static String vehicleType = "Car";



    //final static method
    public void brake() {
        System.out.println("The car is braked");
    }


    @Override
    public void drive() {

    }

    @Override
    public void backUp() {

    }

    @Override
    public void overtake() {

    }

    @Override
    public boolean honk() {

        return true;
    }

    @Override
    public void indicate() {

    }

    public static void DisplayColor(){
        Collection<String> collection =new ArrayList<>();
        Collections.addAll(collection,"Blue","Purple","Black");
    }
}
