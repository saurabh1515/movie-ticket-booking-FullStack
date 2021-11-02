package com.capgemini.movieTicketBooking.service;

import java.util.List;

import com.capgemini.movieTicketBooking.model.TicketBooking;

public interface BookingService {
	
	TicketBooking addBooking(TicketBooking booking);
	TicketBooking updateBooking(TicketBooking booking);
	TicketBooking cancelBooking(TicketBooking booking);
	List<TicketBooking> showAllBooking();
	
}
