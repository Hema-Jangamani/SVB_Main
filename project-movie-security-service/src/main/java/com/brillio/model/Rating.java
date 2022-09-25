package com.brillio.model;

import java.io.Serializable;

import javax.persistence.IdClass;

public class Rating{
	
	private String movieId;
	private String userId;
	
	private int rating;
	
	public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rating(String movieId,String userId, int rating) {
		super();
		this.movieId = movieId;
		this.userId = userId;
		this.rating = rating;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Rating [movieId=" + movieId + ", userId=" + userId + ", rating=" + rating + "]";
	}
	
	

	
	

}
