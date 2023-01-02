package com.solvd;

import com.solvd.models.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    //    public static org.apache.logging.log4j.Logger logger;
    public static void main(String[] args) {


        //destinations
        Destination destination = new Destination();
        destination.setId(1);
        destination.setName("Tbilisi-Batumi");
        destination.setStationFrom("Tbilisi");
        destination.setStationTo("Batumi");
        // wheels
        Wheel wheel = new Wheel();
        wheel.setId(1);
        wheel.setSize("17");
        wheel.setBrandName("Hokohama");

        //tickets
        Ticket ticket = new Ticket();
        ticket.setPrice(50);
        ticket.setTicketType("single");
        ticket.setTicketSeats("69");
        ticket.setHasTicket(true);

        // vehicles
        Vehicle vehicle = new Vehicle();
        vehicle.setWheel(wheel);


        //person
        Person person = new Person();
        person.setId(13);
        person.setFirstName("MAri");
        person.setLastName("Takidze");
        person.setAge(28);
        person.setSex("Female");
//        person.displayPersonInfo();
        //passenger
        Passenger passenger = new Passenger();
        passenger.setFirstName("Lolita");
        passenger.setLastName("Bosh");
        passenger.setAge(42);
        passenger.setSex("Female");
        passenger.setTicket(ticket);
        //driving licences
        DrivingLicenses drivingLicenses = new DrivingLicenses();
        drivingLicenses.setType("B");
        drivingLicenses.setLicenseValidation("true");
        //driver
        Driver driver = new Driver(12, "Giuseppe", "Verdi", 32, "Male");
//       driver.setFirstName("Roberto");
//       driver.setLastName("Rodriguez");
//       driver.setAge(72);
//       driver.setSex("Male");
        driver.setDrivingLicense(drivingLicenses);

        Driver myDriver = new Driver(12, "Giuseppe", "Verdi", 32, "Male");
        //stations
        Stations stations = new Stations();
        stations.setName("Ureki");
        //engine
        Engine engine = new Engine();
        engine.setStateOFEngine("off");
        engine.start();

//

        LOGGER.info(wheel.getId());
        LOGGER.info(wheel.getBrandName());
        LOGGER.info(wheel.getBrandName());
        LOGGER.info(wheel.getSize());

        LOGGER.info(destination.getStationFrom());
        LOGGER.info(destination.getStationTo());

        LOGGER.info(stations.getName());


        LOGGER.info(passenger.getFirstName());
        LOGGER.info(passenger.getAge());
        LOGGER.info(passenger.toString());
        LOGGER.info(driver.toString());


        LOGGER.info(person.toString());
        LOGGER.info(person.hashCode());
        LOGGER.info(person.equals(null));

        LOGGER.info(passenger.equals(driver));
        LOGGER.info(driver.equals(myDriver));
        LOGGER.info(myDriver.hashCode());
        LOGGER.info(driver.hashCode());


        vehicle.setEngine(engine);


        LOGGER.info("--------------------------------------");
        vehicle.move();


        LOGGER.info(ticket.getPrice());
        LOGGER.info(ticket.getTicketType());
        LOGGER.info(ticket.getTicketSeats());


        //interfaces polymorphism static final

        //creating the car object
        Car car = new Car();
        car.setColor("red");
        car.setColor("blue");
        car.setVehicleType("bus");
        car.honk();
        car.drive();
        //accessing via class reference
        car.brake();


        LOGGER.info(car.getVehicleType());
        LOGGER.info(car.getColor());
        LOGGER.info(car.honk());
//        System.out.println(car.getVehicleType()); //???


        // person object
        LOGGER.info(person.think());
        LOGGER.info(person.speak());
//        person.think();
//        person.speak();
        person.setFirstName("Maree");
        person.setAge(32);
        LOGGER.info(person.getFirstName());
//        person.displayPersonInfo("Mar","Gango","Female",29);

        LOGGER.info(person.getAge());


    }
}