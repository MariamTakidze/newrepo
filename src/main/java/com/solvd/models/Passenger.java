package com.solvd.models;

public class Passenger extends Person {

    private int id;

    private Ticket ticket;



    public Passenger() {

    }

    //

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }


}
//