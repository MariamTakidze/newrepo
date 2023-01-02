package com.solvd.exceptions;

public class InvalidDrivingAgeException extends Exception{
    public InvalidDrivingAgeException(){}
    public InvalidDrivingAgeException(String message){
        super(message);
    }
}
