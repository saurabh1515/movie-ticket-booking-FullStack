package com.capgemini.movieTicketBooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.movieTicketBooking.model.Seat;
import com.capgemini.movieTicketBooking.model.Ticket;
import com.capgemini.movieTicketBooking.repository.SeatRepository;
import com.capgemini.movieTicketBooking.service.TicketService;

@RestController
public class TicketController {
	@Autowired
	private TicketService service;
	
	@Autowired
	private SeatRepository seatRepository;
	
	@GetMapping("/tickets")
	public List<Ticket> getAllTickets(){
		return service.viewAllTickets();
	}
	
	@PostMapping("/ticket")
	public Ticket addTicket(@RequestBody Ticket ticket){
		return service.addTicket(ticket);
	}
	
	@PutMapping("/ticket")
	public Ticket updateTicket(@RequestBody Ticket ticket){
		return service.updateTicket(ticket);
	}
	
	@DeleteMapping("/ticket")
	public Ticket deleteTicket(@RequestBody Ticket ticket){
		return service.removeTicket(ticket);
	}
	
	@PostMapping("/ticket/{id}/addSeat")
	public Ticket addSeat(@PathVariable("id") Integer id, @RequestBody Seat seat){
		Ticket t = service.viewTicket(id);
		t.addSeat(seat);
		seatRepository.save(seat);
		return t;
	}
	
	@DeleteMapping("/ticket/{id}/removeSeat")
	public Ticket removeSeat(@PathVariable("id") Integer id, @RequestBody Seat seat){
		Ticket t = service.viewTicket(id);
		t.removeSeat(seat);
		seatRepository.delete(seat);
		return t;
	}
	
}
