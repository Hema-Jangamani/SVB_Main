package com.brillio.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brillio.model.Rating;
import com.brillio.model.UserRating;
import com.brillio.service.RatingService;

@CrossOrigin
@RestController
@RequestMapping("/rating")
public class RatingController {
	
	@Autowired
	private RatingService ratingService;
	
//	@PostMapping("/add")
//	public void addMovieRating(@RequestBody Rating rating) {
//		ratingService.addRating(rating);
//	}
	
	@RequestMapping("/user/{userId}")
	public List<Rating> getMovieRatingsOfUser(@PathVariable String userId) {
		return ratingService.getMovieRatingProvidedByUser(userId);
		
	}
	
	@RequestMapping("/movie/{movieId}")
	public UserRating getRatingOfMovie(@PathVariable String movieId) {
		return ratingService.getRatingOfMovie(movieId);
		
	}
}
