package com.capgemini.movieTicketBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.movieTicketBooking.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
		
}
