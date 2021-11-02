package com.capgemini.movieTicketBooking;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capgemini.movieTicketBooking.model.Customer;
import com.capgemini.movieTicketBooking.model.Movie;
import com.capgemini.movieTicketBooking.service.CustomerService;
import com.capgemini.movieTicketBooking.service.MovieService;

@SpringBootTest
class MovieTicketBookingApplicationTests {
	@Autowired
	private CustomerService service;
	
	@Autowired
	private MovieService movieService;
	
	@Test
	void createCustomerTest() {
		
		Customer customer = new Customer();
		customer.setCustomerName("Ravi");
		customer.setAddress("11 Sector-c Delhi");
		customer.setEmail("ravi@gamil.com");
		customer.setPassword("ravi123");
		customer.setMobileNumber("9812234");
		//saving customer to database
		Customer saveCustomer = service.addCustomer(customer);
		Assertions.assertEquals(customer.getCustomerName(), saveCustomer.getCustomerName());
	}
	
	
	@Test
	void updateCustomerTest() {
		Customer customer = service.viewCustomer(3);
		// updating email
		customer.setEmail("ravi123@gamil.com");
		//updating customer
		Customer saveCustomer = service.updateCustomer(customer);
		Assertions.assertEquals(customer.getEmail(), saveCustomer.getEmail());
	}
	
	
	@Test
	void addMovieTest() {
		Movie movie = new Movie();
		movie.setMovieName("3 idiots");
		movie.setLanguage("Hindi");
		movie.setMovieHours("2h 51m");
		movie.setDescription("Farhan and Raju form a great bond with Rancho due to his refreshing outlook.");
		// adding movie to database
		Movie saveMovie = movieService.addMovie(movie);
		Assertions.assertEquals(movie.getMovieName(), saveMovie.getMovieName());
	}
	
	@Test
	void updateMovieTest() {
		Movie movie = movieService.viewMovie(1);
		// updating movie hours
		movie.setMovieHours("2h 20m");
		// updating movie
		Movie saveMovie = movieService.updateMovie(movie);
		Assertions.assertEquals(movie.getMovieHours(), saveMovie.getMovieHours());
	}
	

}
