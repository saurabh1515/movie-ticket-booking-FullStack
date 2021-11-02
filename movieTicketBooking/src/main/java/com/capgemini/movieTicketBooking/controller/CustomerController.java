package com.capgemini.movieTicketBooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.movieTicketBooking.model.Customer;
import com.capgemini.movieTicketBooking.service.CustomerService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class CustomerController {
	@Autowired
	private CustomerService service;
	
	
	@GetMapping("/customers/{id}")
	public Customer getCustomerById(@PathVariable("id") Integer id) {
		
		return service.viewCustomer(id);
	}
	
	@GetMapping("/customers")
	public List<Customer> getAllCustomers() {
		
		return service.viewAllCustomers();
	}
	
	@PostMapping("/customers")
	public Customer addCustomer(@RequestBody Customer customer) {
		
		return service.addCustomer(customer);
	}
	
	@PutMapping("/customers")
	public Customer updateCustomer(@RequestBody Customer customer) {
		
		return service.updateCustomer(customer);
	}
	
	@DeleteMapping("/customers/{id}")
	public Customer deleteCustomer(@PathVariable("id") Integer id) {
		
		return service.deleteCustomer(id);
	}
	
}
