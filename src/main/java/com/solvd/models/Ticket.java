package com.solvd.models;

import com.solvd.interfaces.Buyable;

public class Ticket implements Buyable {

    private int id;

    private String ticketType;

    private double price;

    private  String ticketSeats;

    private boolean hasTicket;
    //default constructor
    public Ticket() {
    }


    //getters & setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTicketSeats() {
        return ticketSeats;
    }

    public void setTicketSeats(String ticketSeats) {
        this.ticketSeats = ticketSeats;
    }


    public boolean isHasTicket() {
        return hasTicket;
    }

    public void setHasTicket(boolean hasTicket) {
        this.hasTicket = hasTicket;
    }
}
