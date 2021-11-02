package com.capgemini.movieTicketBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.movieTicketBooking.model.Seat;


@Repository
public interface SeatRepository  extends JpaRepository<Seat, Integer> {

}
