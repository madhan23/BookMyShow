package com.bookmyShow.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class BookingTicket {
	 private static int idCounter=0;
	private Integer id;
	private User user;
	private Movie movie;
	private int NumberOfSeats;
	private BigDecimal totalAmount;
	private BookingStatus status;
	private Show BookedShow;
	private LocalDateTime bookingTime;
	
	
	
	
	public LocalDateTime getBookingTime() {
		return bookingTime;
	}
	public void setBookingTime(LocalDateTime bookingTime) {
		this.bookingTime = bookingTime;
	}
	public BookingTicket() {
		
	}
	public BookingTicket(Integer id, User user, Movie movie, int numberOfSeats, BigDecimal totalAmount,
			BookingStatus status, Show bookedShow, LocalDateTime bookingTime) {
		super();
		this.id = ++idCounter;
		this.user = user;
		this.movie = movie;
		NumberOfSeats = numberOfSeats;
		this.totalAmount = totalAmount;
		this.status = status;
		BookedShow = bookedShow;
		this.bookingTime = bookingTime;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public int getNumberOfSeats() {
		return NumberOfSeats;
	}
	public void setNumberOfSeats(int numberOfSeats) {
		NumberOfSeats = numberOfSeats;
	}
	public BigDecimal getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}
	public BookingStatus getStatus() {
		return status;
	}
	public void setStatus(BookingStatus status) {
		this.status = status;
	}
	public Show getBookedShow() {
		return BookedShow;
	}
	public void setBookedShow(Show setBookedShow) {
		this.BookedShow = setBookedShow;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	@Override
	public String toString() {
		return "BookingTicket [id=" + id + ", user=" + user + ", movie=" + movie + ", NumberOfSeats=" + NumberOfSeats
				+ ", totalAmount=" + totalAmount + ", status=" + status + ", BookedShow=" + BookedShow
				+ ", bookingTime=" + bookingTime + "]";
	}

	
	
	
}
