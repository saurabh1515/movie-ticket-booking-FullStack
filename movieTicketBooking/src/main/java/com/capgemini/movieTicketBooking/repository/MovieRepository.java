package com.capgemini.movieTicketBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.movieTicketBooking.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer>{

}
