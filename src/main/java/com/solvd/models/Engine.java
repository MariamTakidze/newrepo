package com.solvd.models;

public class Engine {

    private int id;

    private String stateOFEngine;

    public Engine() {
    }

    //functions
    public void start(){
        if(this.stateOFEngine == "On"){
            System.out.println("Engine is On");
        }else{
            this.setStateOFEngine("On");
            System.out.println("Engine is now On");
        }
    }

    public void stop(){
        if(this.stateOFEngine == "Off"){
            System.out.println("Engine is Off");
        }else{
            this.setStateOFEngine("Off");
            System.out.println("Engine is now Off");
        }
    }

    public String getStateOFEngine() {
        return stateOFEngine;
    }

    public void setStateOFEngine(String stateOFEngine) {
        this.stateOFEngine = stateOFEngine;
    }
}
