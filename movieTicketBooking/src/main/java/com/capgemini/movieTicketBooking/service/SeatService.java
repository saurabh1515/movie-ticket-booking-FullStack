package com.capgemini.movieTicketBooking.service;

import com.capgemini.movieTicketBooking.model.Seat;

public interface SeatService {
	
	Seat bookSeat(Seat seat);
	Seat cancelSeatBooking(Seat seat);
	Seat blockSeat(Seat seat);
}
