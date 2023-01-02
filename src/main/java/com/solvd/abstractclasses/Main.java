package com.solvd.abstractclasses;

import com.solvd.models.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        //car
        Car myCar = new Car();
        myCar.setId(7);
        myCar.setColor("Green");
        myCar.isGoing("Barcelona","Valencia");
        myCar.drive();
        //Hey! What are you doing? drive method in vehicle is final !!! Don't you remember?!

        LOGGER.info(myCar);

        Driver busDriver = new Driver();
        busDriver.setFirstName("Spyros");
        busDriver.setLastName("Bangis");
        //bus
        Bus cityBus = new Bus();
        cityBus.setColor("yellowish");
        cityBus.setDriver(new Driver());
//        cityBus.setBusLineNumber(708);
        cityBus.isGoing("Attiki","Zografou");
        LOGGER.info(cityBus);

        //bike
        Bike myBike = new Bike();
        myBike.setNumberOfBrakes(3);
        myBike.setColor("Purple");
        myBike.isGoing("Santiago", "Vigo");
        LOGGER.info(myBike);
        LOGGER.error(myBike.hashCode());






    }
}
