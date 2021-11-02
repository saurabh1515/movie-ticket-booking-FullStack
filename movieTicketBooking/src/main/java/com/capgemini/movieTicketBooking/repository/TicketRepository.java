package com.capgemini.movieTicketBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.movieTicketBooking.model.Ticket;

@Repository
public interface TicketRepository  extends JpaRepository<Ticket, Integer>{

}
