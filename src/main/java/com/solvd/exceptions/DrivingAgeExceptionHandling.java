package com.solvd.exceptions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class DrivingAgeExceptionHandling {
//    public static org.apache.logging.log4j.Logger logger;
    private static final Logger LOGGER = LogManager.getLogger(DrivingAgeExceptionHandling.class);
    static void validateDrivingAge (int age) throws InvalidDrivingAgeException{
        if(age < 17){


            throw new InvalidDrivingAgeException("age is not valid to get Driving license");
        }
        else {
            LOGGER.info("You can get Driving license");
        }

    }
    public static void main(String[] args) {
        try{
            validateDrivingAge(19);
        }
        catch (NumberFormatException  e){
            System.out.println("Number format exception occurred" + e.getMessage());
            LOGGER.error(e.getMessage());
        }
        catch (InvalidDrivingAgeException exception){
            LOGGER.info("Age is less than 17");
            LOGGER.error(exception.getMessage());
        }
        finally {
            LOGGER.info("I am always executed");
        }
            LOGGER.info("End of our journey");
    }
}
