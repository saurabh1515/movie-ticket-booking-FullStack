package com.capgemini.movieTicketBooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.movieTicketBooking.service.BookingService;
import com.capgemini.movieTicketBooking.model.TicketBooking;

@RestController
public class BookingController {
	@Autowired
	private BookingService service;
	
	@GetMapping("/bookings")
	public List<TicketBooking> getAllBookings(){
		return service.showAllBooking();
	}
	
	@PostMapping("/booking")
	public TicketBooking addBooking(@RequestBody TicketBooking booking){
		return service.addBooking(booking);
	}
	
	@PutMapping("/booking")
	public TicketBooking updateBooking(@RequestBody TicketBooking booking){
		return service.updateBooking(booking);
	}
	
	@DeleteMapping("/booking")
	public TicketBooking deleteBooking(@RequestBody TicketBooking booking){
		return service.cancelBooking(booking);
	}
	
	
	
}
