package com.brillio.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brillio.model.Rating;
import com.brillio.model.UserRating;
import com.brillio.repository.RatingRepository;

@Service
public class RatingService {

	@Autowired
	private RatingRepository ratingRepository;
	
	public void addRating(Rating rating) {
		ratingRepository.save(rating);
	}
	
	public List<Rating> getMovieRatingProvidedByUser(String userId) {
		return ratingRepository.findByUserId(userId);
	}

	public UserRating getRatingOfMovie(String movieId) {
		UserRating ratinglist = new UserRating();
		ratinglist.setRatings(ratingRepository.findByMovieId(movieId));
		return ratinglist;
	}

	
}
