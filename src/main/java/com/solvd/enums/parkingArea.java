package com.solvd.enums;
import static com.solvd.enums.vehicleType.*;
import static com.solvd.enums.color.*;
import static com.solvd.enums.manufacturers.*;
import static com.solvd.enums.drivingLicenseCategories.*;

public enum parkingArea {

    MYCAR(CAR,BLACK,FORD,B),
    MYCRUSHSCAR(CAR,BLUE,BMW,B),
    SCHOOLBUS(BUS,YELLOW,TRATON,D),
    MOTORBIKE(MOTORCYCLE,GREEN,DAVIDSON,A),

    MINIB(MINIBUS,WHITE,WOLKSWAGEN,D1);


    private vehicleType type;
    private color color;
    private manufacturers manufacturers;
    private drivingLicenseCategories drivingLicenseCategories;

    public vehicleType getType() {
        return type;
    }

    public void setType(vehicleType type) {
        this.type = type;
    }

    public com.solvd.enums.color getColor() {
        return color;
    }

    public void setColor(com.solvd.enums.color color) {
        this.color = color;
    }

    public com.solvd.enums.manufacturers getManufacturers() {
        return manufacturers;
    }

    public void setManufacturers(com.solvd.enums.manufacturers manufacturers) {
        this.manufacturers = manufacturers;
    }

    public com.solvd.enums.drivingLicenseCategories getDrivingLicenseCategories() {
        return drivingLicenseCategories;
    }

    public void setDrivingLicenseCategories(com.solvd.enums.drivingLicenseCategories drivingLicenseCategories) {
        this.drivingLicenseCategories = drivingLicenseCategories;
    }

    parkingArea(vehicleType type, com.solvd.enums.color color, com.solvd.enums.manufacturers manufacturers, com.solvd.enums.drivingLicenseCategories drivingLicenseCategories) {
        this.type = type;
        this.color = color;
        this.manufacturers = manufacturers;
        this.drivingLicenseCategories = drivingLicenseCategories;
    }



}
