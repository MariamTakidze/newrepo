package com.solvd.enums;

public enum color {
    RED(1), YELLOW(2), BLUE(3),BLACK(4),WHITE(5),PURPLE(6),GREEN(7),BROWN(8),GRAY(9);

    private int value;

    private color(){}

    private color(int i){
        this.value = i;
    }

    //define instance method
    public void printValue(){
        System.out.println(this.value);
    }

    public int getValue() {
        return value;
    }
}
