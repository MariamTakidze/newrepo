package com.solvd.abstractclasses;

import com.solvd.models.Driver;
import com.solvd.models.Passenger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class Bus extends Vehicle{
    private static final Logger LOGGER = LogManager.getLogger(Bus.class);
    private int busLineNumber;
    private int seatsInBus;
    private Driver driver;
    private Passenger passenger;

    public Bus() {
        super.setType("Bus");
        super.setWeight(12000);
        super.setYear(2008);
        busLineNumber = 608;
        seatsInBus = 16;
    }

    public Bus(int busLineNumber, int seatsInBus, Driver driver, Passenger passenger) {
        this.busLineNumber = busLineNumber;
        this.seatsInBus = seatsInBus;
        this.driver = driver;
        this.passenger = passenger;
    }

    public int getBusLineNumber() {
        return busLineNumber;
    }

    public void setBusLineNumber(int busLineNumber) {
        this.busLineNumber = busLineNumber;
    }

    public int getSeatsInBus() {
        return seatsInBus;
    }

    public void setSeatsInBus(int seatsInBus) {
        this.seatsInBus = seatsInBus;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }


    //bus is not abstract and does not override abstract is going
//    @Override
//    public void isGoing(String firstStation, String secondStation, Driver driver, Passenger passenger) {
//        LOGGER.info(super.getType()+" busLineNumber "+busLineNumber+" is moving from "+firstStation+" to "+secondStation +"BusDriver:" + driver.getFirstName() + driver.getLastName());
//    }
    @Override
    public void isGoing(String firstStation, String secondStation ) {
        LOGGER.info(super.getType()+" busLineNumber "+busLineNumber+" is moving from "+firstStation+" to "+secondStation );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return busLineNumber == bus.busLineNumber && seatsInBus == bus.seatsInBus && Objects.equals(driver, bus.driver) && Objects.equals(passenger, bus.passenger);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), busLineNumber, seatsInBus);
    }
}
