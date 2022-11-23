package com.bookmyShow.model;

public class TicketBookingThread extends Thread {
    private Show show;
    private RegisteredUser user;
    private int numberOfSeats;
    private BookingTicket ticket;

    public TicketBookingThread(Show show, RegisteredUser user, int numberOfSeats) {
        this.show = show;
        this.user = user;
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void run() {
        this.ticket = show.bookTicket(user,numberOfSeats);
    }

    public BookingTicket getTicket() {
        return ticket;
    }
}