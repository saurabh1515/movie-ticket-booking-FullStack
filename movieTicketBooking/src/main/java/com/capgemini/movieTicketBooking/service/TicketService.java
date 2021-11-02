package com.capgemini.movieTicketBooking.service;

import java.util.List;

import com.capgemini.movieTicketBooking.model.Ticket;

public interface TicketService {
	
	Ticket addTicket(Ticket ticket);
	Ticket updateTicket(Ticket ticket);
	Ticket removeTicket(Ticket ticket);
	List<Ticket> viewAllTickets();
	Ticket viewTicket(Integer id);
	
}
