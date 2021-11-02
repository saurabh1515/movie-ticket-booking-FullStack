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

import com.capgemini.movieTicketBooking.model.Movie;
import com.capgemini.movieTicketBooking.service.MovieService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class MovieController {
	@Autowired
	private MovieService service;
	
	@GetMapping("/movies/{id}")
	public Movie getMovieById(@PathVariable("id") Integer id) {
		
		return service.viewMovie(id);
	}
	
	@GetMapping("/movies")
	public List<Movie> getAllMovies() {
		
		return service.viewMovieList();
	}
	
	@PostMapping("/movies")
	public Movie addMovie(@RequestBody Movie movie) {
		
		return service.addMovie(movie);
	}
	
	@PutMapping("/movies")
	public Movie updateMovie(@RequestBody Movie movie) {
		
		return service.updateMovie(movie);
	}
	
	@DeleteMapping("/movies/{id}")
	public Movie deleteMovie(@PathVariable("id") Integer id) {
		
		return service.removeMovie(id);
	}
	
	
}
