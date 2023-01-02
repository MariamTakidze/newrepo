package com.solvd.interfaces;

public interface Drivable {


     void backUp(); //reverse- to go backwards
     void overtake(); //to go past another vehicle
     boolean honk();
     void indicate(); //switching indicators in order to signal that driver intends to change direction
     //static methods should have bodies
     default void brake(){

     };

}
