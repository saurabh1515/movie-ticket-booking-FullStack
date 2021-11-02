package com.capgemini.movieTicketBooking.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.movieTicketBooking.model.Customer;
import com.capgemini.movieTicketBooking.repository.CustomerRepository;
import com.capgemini.movieTicketBooking.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRepository repo;

	@Override
	public Customer addCustomer(Customer customer) {
		
		return repo.save(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		return repo.save(customer);
	}

	@Override
	public Customer deleteCustomer(int custId) {
		Customer customer = repo.findById(custId).get();
		repo.delete(customer);
		return customer;
	}

	@Override
	public Customer viewCustomer(int custId) {
		return repo.findById(custId).orElse(new Customer());
	}

	@Override
	public List<Customer> viewAllCustomers() {
		
		return repo.findAll();
	}

}
