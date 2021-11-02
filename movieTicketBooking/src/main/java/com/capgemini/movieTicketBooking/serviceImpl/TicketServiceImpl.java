package com.capgemini.movieTicketBooking.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.movieTicketBooking.model.Ticket;
import com.capgemini.movieTicketBooking.repository.TicketRepository;
import com.capgemini.movieTicketBooking.service.TicketService;

@Service
public class TicketServiceImpl implements TicketService{
	@Autowired
	private TicketRepository repo;
	
	@Override
	public Ticket addTicket(Ticket ticket) {
		
		return repo.save(ticket);
	}

	@Override
	public Ticket updateTicket(Ticket ticket) {
		return repo.save(ticket);
	}

	@Override
	public Ticket removeTicket(Ticket ticket) {
		repo.delete(ticket);
		return ticket;
	}

	@Override
	public List<Ticket> viewAllTickets() {
		
		return repo.findAll();
	}

	@Override
	public Ticket viewTicket(Integer id) {
		
		return repo.findById(id).get();
	}

}
