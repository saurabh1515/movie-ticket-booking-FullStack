package com.capgemini.movieTicketBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.movieTicketBooking.model.TicketBooking;

@Repository
public interface BookingRepository extends JpaRepository<TicketBooking, Integer> {

}
