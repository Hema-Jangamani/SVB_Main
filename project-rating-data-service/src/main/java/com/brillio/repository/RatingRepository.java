package com.brillio.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.brillio.model.Rating;
import com.brillio.model.RatingIds;

public interface RatingRepository extends CrudRepository<Rating, RatingIds>{
	public List<Rating> findByUserId(String userId);
	public List<Rating> findByMovieId(String movieId);
}
