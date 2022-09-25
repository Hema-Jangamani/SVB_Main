package com.brillio.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brillio.model.Movie;
import com.brillio.repository.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository movieRepository;
	
	public void addMovie(Movie movie) {
		movieRepository.save(movie);
	}
	
	public List<Movie> getAllMovies(){
		List<Movie> list = new ArrayList<>();
		movieRepository.findAll().forEach(list::add);
		return list;
	}
	
	public Movie getMovieById(String movieId) {
		return movieRepository.findById(movieId).get();
	}
	
	public Movie getMovieByName(String name) {
		return movieRepository.findByName(name);
	}

}
