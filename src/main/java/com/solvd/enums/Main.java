package com.solvd.enums;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        parkingArea vehicle =parkingArea.MOTORBIKE;
        LOGGER.info("Vehicle Type "+vehicle.getType());
        LOGGER.info("Manufacturer "+vehicle.getManufacturers());
        LOGGER.info("Color "+vehicle.getColor());
        LOGGER.info("drivingLicenseCat "+ vehicle.getDrivingLicenseCategories());



    }
}
