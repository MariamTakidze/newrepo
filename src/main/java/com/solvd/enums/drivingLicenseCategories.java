package com.solvd.enums;
import static com.solvd.enums.vehicleType.*;
import static com.solvd.enums.speed.*;
public enum drivingLicenseCategories {
    A(MOTORCYCLE,24,SUPERHIGH),
    A1(MOPED,17, LOW),
    B(CAR,17,HIGH),
    BE(TRAILER,18,NORMAL),
    C(TRUCK,21,NORMAL),
    D(BUS,24,LOW),
    D1(MINIBUS,21,LOW);



    private final vehicleType type;
    private final int validAgeForCertification;
    private speed speed;

    drivingLicenseCategories(vehicleType vehicleType, int validAgeForCertification, speed speed) {
        this.validAgeForCertification = validAgeForCertification;
        this.type = vehicleType;
        this.speed = speed;
    }

    public int getValidAgeForCertification() {
        return validAgeForCertification;
    }

}
