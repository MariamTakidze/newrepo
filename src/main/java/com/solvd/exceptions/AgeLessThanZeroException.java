package com.solvd.exceptions;

public class AgeLessThanZeroException extends Exception{ //IllegalArgumentException could be as well

    public AgeLessThanZeroException(){}
    public AgeLessThanZeroException(String message){
        super(message);
    }

}
