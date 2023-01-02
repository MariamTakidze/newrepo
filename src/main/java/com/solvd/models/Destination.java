package com.solvd.models;

public class Destination {

    private int id;

    private String stationFrom;
    private String stationTo;

    private String name;


    public Destination() {
    }

    public Destination(int id, String stationFrom,String stationTo, String name) {
        this.id = id;
        this.stationFrom = stationFrom;
        this.stationTo = stationTo;
        this.name = name;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }


    public String getStationFrom() {
        return stationFrom;
    }

    public void setStationFrom(String stationFrom) {
        this.stationFrom = stationFrom;
    }

    public String getStationTo() {
        return stationTo;
    }

    public void setStationTo(String stationTo) {
        this.stationTo = stationTo;
    }
}
