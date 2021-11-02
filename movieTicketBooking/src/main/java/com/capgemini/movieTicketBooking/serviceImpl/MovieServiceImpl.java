package com.capgemini.movieTicketBooking.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.movieTicketBooking.model.Movie;
import com.capgemini.movieTicketBooking.repository.MovieRepository;
import com.capgemini.movieTicketBooking.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService {
	
	@Autowired
	private MovieRepository repo;

	@Override
	public Movie addMovie(Movie movie) {

		return repo.save(movie);
	}

	@Override
	public Movie updateMovie(Movie movie) {
		return repo.save(movie);
	}

	@Override
	public Movie removeMovie(int movieId) {
		Movie movie = repo.findById(movieId).get();
		repo.delete(movie);
		return movie;
	}

	@Override
	public Movie viewMovie(int movieId) {
		return repo.findById(movieId).orElse(new Movie());
	}

	@Override
	public List<Movie> viewMovieList() {
		return repo.findAll();
	}

}
