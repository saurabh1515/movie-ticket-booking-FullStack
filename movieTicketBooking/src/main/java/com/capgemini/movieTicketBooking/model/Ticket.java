package com.capgemini.movieTicketBooking.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Ticket {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int ticketId;
	
	private int noOfSeats;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_ticket_id", referencedColumnName = "ticketId")
	private List<Seat> seatNumber;
	
	private boolean ticketStatus;
	
	@OneToOne
	private TicketBooking booking;
	
	public Ticket() {}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public List<Seat> getSeatNumber() {
		return seatNumber;
	}

	public void addSeat(Seat seat) {
		seatNumber.add(seat);
	}
	public void removeSeat(Seat seat) {
		seatNumber.remove(seat);
	}
	
	
	public boolean isTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(boolean ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public TicketBooking getBooking() {
		return booking;
	}

	public void setBooking(TicketBooking booking) {
		this.booking = booking;
	}
	
	
	
	
}
