package com.solvd.collections;

import java.util.HashSet;
import java.util.Iterator;

public class drivingLicenses {
    public static void main(String args[]){
        //Creating HashSet and adding elements
        HashSet<String> drivingLicensesSet=new HashSet<String>();
        drivingLicensesSet.add("A");
        drivingLicensesSet.add("B");
        drivingLicensesSet.add("C");
        drivingLicensesSet.add("D");
        drivingLicensesSet.add("BE");
        drivingLicensesSet.add("CE");
        //Traversing elements
        Iterator<String> itr= drivingLicensesSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
