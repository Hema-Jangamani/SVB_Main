package com.brillio.model;

import java.io.Serializable;
import java.util.Objects;

public class RatingIds implements Serializable{

	private String movieId;
	private String userId;
	
	public RatingIds() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RatingIds(String movieId, String userId) {
		super();
		this.movieId = movieId;
		this.userId = userId;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(movieId, userId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RatingIds other = (RatingIds) obj;
		return Objects.equals(movieId, other.movieId) && Objects.equals(userId, other.userId);
	}
	
}
