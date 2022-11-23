package com.bookmyShow.model;

import java.time.LocalDateTime;
import java.util.Date;

public class Show {
	 private static int idCounter=0;
	private Integer id;
	private Date showTime;
	private int availableSeats;
	private Movie movie;
	private Theater theater;
	
	public Show(Date showTime, Movie movie, Theater theater) {
		super();
		this.id =++idCounter;
		this.showTime = showTime;
		this.availableSeats = theater.getCapacity();
		this.movie = movie;
		this.theater = theater;
		this.theater.getShows().add(this);
	}

	public static int getIdCounter() {
		return idCounter;
	}

	public static void setIdCounter(int idCounter) {
		Show.idCounter = idCounter;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getShowTime() {
		return showTime;
	}

	public void setShowTime(Date showTime) {
		this.showTime = showTime;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Theater getTheater() {
		return theater;
	}

	public void setTheater(Theater theater) {
		this.theater = theater;
	}
	
	  public void updateShow(){
	    }
	  
	  
	    public synchronized BookingTicket bookTicket(RegisteredUser user, int seats){
	        if(availableSeats >= seats && seats >0){
	            BookingTicket ticket = new BookingTicket();
	            availableSeats -= seats;
	            ticket.setUser(user);
	            ticket.setBookedShow(this);
	            ticket.setBookingTime(LocalDateTime.now());
	            ticket.setNumberOfSeats(seats);
	            System.out.println("Successfully booked");
	            user.bookingHistory.add(ticket);
	            return ticket;
	        }
	        else{
	            System.out.println("Seats not Available");
	            return null;
	        }
	    }

		@Override
		public String toString() {
			return "Show [id=" + id + ", showTime=" + showTime + ", availableSeats=" + availableSeats + ", movie="
					+ movie + ", theater=" + theater + "]";
		}
	   

	
}
