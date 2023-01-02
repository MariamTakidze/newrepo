package com.solvd.exceptions;

public class TestCustomizedException {


    public static void main(String[] args) throws AgeLessThanZeroException {
        validateAge(7);
    }
    private static void validateAge(int age) throws AgeLessThanZeroException {
        if(age < 0){
        throw new AgeLessThanZeroException("Invalid age");
        }
    }



}
