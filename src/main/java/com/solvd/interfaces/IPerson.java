package com.solvd.interfaces;

public interface IPerson extends ISpeak, IThink {

    void displayPersonInfo(String firstName,String lastName,String sex,int age);
}

