package com.bookmyShow.model;

import java.util.ArrayList;
import java.util.List;

public class RegisteredUser extends User {
    public List<BookingTicket> bookingHistory;

    public RegisteredUser(String name) {
        super(name);
        this.bookingHistory = new ArrayList<>();
    }
    public void cancelTicket(BookingTicket ticket){
    	System.out.println(id);
    } 
}
