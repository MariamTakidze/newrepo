package com.solvd.abstractclasses;

import java.util.Objects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Vehicle {
    private static final Logger LOGGER = LogManager.getLogger(Vehicle.class);
    private int id;
    private String type;
    private int year;
    private double weight;
    private String color;



   public Vehicle(){

   }

    public Vehicle(int id, String brand, int year, double weight, String color) {
        this.id = id;
        this.type = type;
        this.year = year;
        this.weight = weight;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void isGoing(String firstStation, String secondStation);

   //ups! it is final my friends!
    public final void drive() {
        LOGGER.info("Drive me Crazeee");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return id == vehicle.id && year == vehicle.year && Double.compare(vehicle.weight, weight) == 0 && Objects.equals(type, vehicle.type) && Objects.equals(color, vehicle.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, year, weight, color);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", year=" + year +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}
