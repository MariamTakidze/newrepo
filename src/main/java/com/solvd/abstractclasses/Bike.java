package com.solvd.abstractclasses;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public final class Bike extends Vehicle{
    private static final Logger LOGGER = LogManager.getLogger(Bike.class);
    private final int wheels=2;

    private int numberOfBrakes;

    public Bike(){
        super.setType("Bike");
        numberOfBrakes = 2;
    }

    public Bike(int numberOfBrakes) {
        this.numberOfBrakes = numberOfBrakes;
    }

    public Bike(int id, String brand, int year, double weight, String color, int numberOfBrakes) {
        super(id, brand, year, weight, color);
        this.numberOfBrakes = numberOfBrakes;
    }

    public int getWheels() {
        return wheels;
    }

    public int getNumberOfBrakes(int i) {
        return numberOfBrakes;
    }

    public void setNumberOfBrakes(int numberOfBrakes) {
        this.numberOfBrakes = numberOfBrakes;
    }

    @Override
    public void isGoing(String firstStation, String secondStation) {
        LOGGER.info(super.getType()+" needs to be ridden From "+firstStation+" to "+secondStation);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bike bike = (Bike) o;
        return wheels == bike.wheels && numberOfBrakes == bike.numberOfBrakes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), wheels, numberOfBrakes);
    }

    @Override
    public String toString() {
        return "Bike{" +
                "wheels=" + wheels +
                ", numberOfBrakes=" + numberOfBrakes +
                '}';
    }
}
