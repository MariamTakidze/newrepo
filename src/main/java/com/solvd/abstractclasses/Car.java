package com.solvd.abstractclasses;

import com.solvd.Main;
import com.solvd.interfaces.Buyable;
import com.solvd.interfaces.Drivable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class Car extends Vehicle {
    private static final Logger LOGGER = LogManager.getLogger(Car.class);

    private int wheels;
    private String fuelType;



    public Car() {
        super.setType("car");
        super.setYear(2012);
        wheels = 4;
        fuelType = "Petroleum";
    }

    public Car(int id, String brand, int year, double weight, String color, int wheels, String fuelType) {
        super(id, brand, year, weight, color);
        this.wheels = wheels;
        this.fuelType = fuelType;
    }

    public Car( int wheels, String fuelType) {

        this.wheels = wheels;
        this.fuelType = fuelType;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }


    @Override
    public void isGoing(String firstStation, String secondStation) {
        LOGGER.info(super.getType() + " is moving From " + firstStation + "  to " + secondStation);
    }

    //no no no overridden method is final
//    @Override
//    public  void drive() {
//        LOGGER.info("Drive");
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return wheels == car.wheels && Objects.equals(fuelType, car.fuelType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), wheels, fuelType);
    }
}
