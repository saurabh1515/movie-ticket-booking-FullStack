package com.capgemini.movieTicketBooking.service;

import java.util.List;


import com.capgemini.movieTicketBooking.model.Customer;


public interface CustomerService {
	
	Customer addCustomer(Customer customer);
	
	Customer updateCustomer(Customer customer);
	
	Customer deleteCustomer(int custId);
	
	Customer viewCustomer(int custId);
	
	List<Customer> viewAllCustomers();
}
