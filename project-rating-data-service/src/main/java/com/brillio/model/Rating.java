package com.brillio.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(RatingIds.class)
@Table(name = "rating")
public class Rating{
	
	@Id
	private String movieId;
	
	@Id
	private String userId;
	
	@Column(name = "rating")
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
	
	

	
	

}
