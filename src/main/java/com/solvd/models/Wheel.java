package com.solvd.models;

public class Wheel {

    private int id;

    private String size;

    private String brandName;


    public Wheel() {
    }

    public Wheel(int id, String size, String brandName) {
        this.id = id;
        this.size = size;
        this.brandName = brandName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
