package com.brillio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brillio.model.Movie;
import com.brillio.service.MovieService;

@CrossOrigin
@RestController
@RequestMapping("/movies")
public class MovieController {
	
	@Autowired
	private MovieService movieService;
	
	@PostMapping("/add")
	public void addMovie(@RequestBody Movie movie) {
		movieService.addMovie(movie);
	}
	
	@RequestMapping("/getAll")
	public List<Movie> getAllMovies() {
		return movieService.getAllMovies();
	}
	
	@RequestMapping("/{movieId}")
	public Movie getMovie(@PathVariable String movieId) {
		return movieService.getMovieById(movieId);
	}
	
	@RequestMapping("/movieName/{name}")
	public Movie getMovieName(@PathVariable String name) {
		return movieService.getMovieByName(name);
	}
	

}

